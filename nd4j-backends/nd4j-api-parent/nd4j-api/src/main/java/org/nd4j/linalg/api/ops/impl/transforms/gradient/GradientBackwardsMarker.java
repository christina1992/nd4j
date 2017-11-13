package org.nd4j.linalg.api.ops.impl.transforms.gradient;

import org.nd4j.autodiff.functions.DifferentialFunction;
import org.nd4j.autodiff.samediff.SameDiff;
import org.nd4j.imports.NoOpNameFoundException;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.BaseGradientOp;

import java.util.List;

/**
 *
 */
public class GradientBackwardsMarker extends BaseGradientOp  {
    public GradientBackwardsMarker(SameDiff sameDiff, DifferentialFunction i_v1, DifferentialFunction i_v2) {
        super(sameDiff, i_v1, i_v2);
    }

    public GradientBackwardsMarker(SameDiff sameDiff, DifferentialFunction i_v1, DifferentialFunction i_v2, boolean inPlace) {
        super(sameDiff, i_v1, i_v2, inPlace);
    }

    public GradientBackwardsMarker(INDArray x, INDArray z) {
        super(x, z);
    }

    public GradientBackwardsMarker() {
    }

    public GradientBackwardsMarker(INDArray x, INDArray z, long n) {
        super(x, z, n);
    }

    public GradientBackwardsMarker(INDArray x, INDArray y, INDArray z) {
        super(x, y, z, z.lengthLong());
    }

    public GradientBackwardsMarker(INDArray x) {
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
        return "gradientbackwards";
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
       //no-op

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
