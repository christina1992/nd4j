/*-
 *
 *  * Copyright 2015 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 *
 */

package org.nd4j.linalg.api.ops.impl.transforms.arithmetic;

import org.nd4j.autodiff.functions.DifferentialFunction;
import org.nd4j.autodiff.samediff.SameDiff;
import org.nd4j.imports.NoOpNameFoundException;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.BaseTransformOp;

import java.util.List;

/**
 * Copy operation
 *
 * @author Adam Gibson
 */
public class CopyOp extends BaseTransformOp {
    public CopyOp(SameDiff sameDiff, DifferentialFunction i_v1, DifferentialFunction i_v2) {
        super(sameDiff, i_v1, i_v2);
    }

    public CopyOp(SameDiff sameDiff, DifferentialFunction i_v1, DifferentialFunction i_v2, boolean inPlace) {
        super(sameDiff, i_v1, i_v2, inPlace);
    }

    public CopyOp(SameDiff sameDiff) {
        super(sameDiff);
    }

    public CopyOp(SameDiff sameDiff, DifferentialFunction i_v1, DifferentialFunction i_v2, Object[] extraArgs) {
        super(sameDiff, i_v1, i_v2, extraArgs);
    }

    public CopyOp(SameDiff sameDiff, DifferentialFunction i_v, boolean inPlace) {
        super(sameDiff, i_v, inPlace);
    }

    public CopyOp(SameDiff sameDiff, DifferentialFunction i_v, int[] shape, boolean inPlace, Object[] extraArgs) {
        super(sameDiff, i_v, shape, inPlace, extraArgs);
    }

    public CopyOp(SameDiff sameDiff, DifferentialFunction i_v, Object[] extraArgs) {
        super(sameDiff, i_v, extraArgs);
    }

    public CopyOp() {}

    public CopyOp(INDArray x, INDArray y, INDArray z, long n) {
        super(x, y, z, n);
    }

    public CopyOp(INDArray x, INDArray z) {
        super(x, z);
    }

    public CopyOp(INDArray x, INDArray z, long n) {
        super(x, z, n);
    }

    public CopyOp(INDArray x) {
        super(x);
    }

    public CopyOp(INDArray x, INDArray xDup, INDArray z) {
        super(x, xDup, z, x.lengthLong());
    }

    @Override
    public int opNum() {
        return 1;
    }

    @Override
    public String name() {
        return "copy";
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
        z.assign(x);
    }

    @Override
    public boolean isPassThrough() {
        return false;
    }


    @Override
    public List<DifferentialFunction> doDiff(List<DifferentialFunction> f1) {
        return null;
    }
}
