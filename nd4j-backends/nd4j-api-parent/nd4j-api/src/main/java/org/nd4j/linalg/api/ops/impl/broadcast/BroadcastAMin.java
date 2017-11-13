package org.nd4j.linalg.api.ops.impl.broadcast;

import org.nd4j.autodiff.functions.DifferentialFunction;
import org.nd4j.autodiff.samediff.SameDiff;
import org.nd4j.imports.NoOpNameFoundException;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.BaseBroadcastOp;

import java.util.List;

/**
 * Broadcast Abs Min comparison op
 *
 * @author raver119@gmail.com
 */
public class BroadcastAMin extends BaseBroadcastOp {
    public BroadcastAMin(SameDiff sameDiff, DifferentialFunction i_v1, DifferentialFunction i_v2, int[] dimension) {
        super(sameDiff, i_v1, i_v2, dimension);
    }

    public BroadcastAMin(SameDiff sameDiff, DifferentialFunction i_v1, DifferentialFunction i_v2, boolean inPlace, int[] dimension) {
        super(sameDiff, i_v1, i_v2, inPlace, dimension);
    }

    public BroadcastAMin(SameDiff sameDiff) {
        super(sameDiff);
    }

    public BroadcastAMin(SameDiff sameDiff, DifferentialFunction i_v1, DifferentialFunction i_v2, int[] dimension, Object[] extraArgs) {
        super(sameDiff, i_v1, i_v2, dimension, extraArgs);
    }

    public BroadcastAMin(SameDiff sameDiff, DifferentialFunction i_v, int[] dimension, boolean inPlace) {
        super(sameDiff, i_v, dimension, inPlace);
    }

    public BroadcastAMin(SameDiff sameDiff, DifferentialFunction i_v, int[] shape, boolean inPlace, int[] dimension, Object[] extraArgs) {
        super(sameDiff, i_v, shape, inPlace, dimension, extraArgs);
    }

    public BroadcastAMin(SameDiff sameDiff, DifferentialFunction i_v, int[] dimension, Object[] extraArgs) {
        super(sameDiff, i_v, dimension, extraArgs);
    }

    public BroadcastAMin() {}

    public BroadcastAMin(INDArray x, INDArray y, INDArray z, int... dimension) {
        super(x, y, z, dimension);
    }


    @Override
    public int opNum() {
        return 15;
    }

    @Override
    public String name() {
        return "broadcast_amin";
    }



    @Override
    public List<DifferentialFunction> doDiff(List<DifferentialFunction> f1) {
        return null;
    }

    @Override
    public String onnxName() {
        throw new NoOpNameFoundException("No onnx name found for " + opName());
    }

    @Override
    public String tensorflowName() {
        throw new NoOpNameFoundException("No tensorflow name found for " + opName());

    }
}
