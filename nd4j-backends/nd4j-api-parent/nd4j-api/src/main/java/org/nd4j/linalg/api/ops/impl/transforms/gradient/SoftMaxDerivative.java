package org.nd4j.linalg.api.ops.impl.transforms.gradient;


import org.nd4j.autodiff.functions.DifferentialFunction;
import org.nd4j.imports.NoOpNameFoundException;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.BaseGradientOp;
import org.nd4j.linalg.api.ops.impl.transforms.SoftMax;
import org.nd4j.linalg.factory.Nd4j;

import java.util.List;

/**
 *
 */
public class SoftMaxDerivative extends BaseGradientOp  {
    public SoftMaxDerivative(INDArray x, INDArray z) {
        super(x, z);
    }

    public SoftMaxDerivative() {
    }

    public SoftMaxDerivative(INDArray x, INDArray z, long n) {
        super(x, z, n);
    }

    public SoftMaxDerivative(INDArray x, INDArray y, INDArray z) {
        super(x, y, z, z.lengthLong());
    }

    public SoftMaxDerivative(INDArray x) {
        super(x);
    }

    /**
     * An op number
     *
     * @return
     */
    @Override
    public int opNum() {
        return 0;
    }

    /**
     * The name of this operation
     *
     * @return the name of this operation
     */
    @Override
    public String name() {
        return "softmaxderivative";
    }



    @Override
    public String onnxName() {
        throw new NoOpNameFoundException("No onnx op name found for " +  opName());
    }

    @Override
    public String tensorflowName() {
        throw new NoOpNameFoundException("No tensorflow op name found for " +  opName());
    }


    @Override
    public void exec() {
        INDArray softmaxed = Nd4j.getExecutioner().execAndReturn(new SoftMax(x));
        INDArray mulled = softmaxed.muli(y);
        INDArray summed = mulled.sum(-1);
        softmaxed.muliColumnVector(summed);
        mulled.subi(softmaxed);

    }

    @Override
    public void exec(int... dimensions) {
        super.exec(dimensions);
    }



    @Override
    public List<DifferentialFunction> doDiff(List<DifferentialFunction> i_v) {
        throw new UnsupportedOperationException();
    }
}
