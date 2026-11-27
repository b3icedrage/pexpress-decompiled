package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: y10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7733y10 extends GV<ByteBuffer> {
    public final int j;

    public C7733y10(int i, int i2) {
        super(i);
        this.j = i2;
    }

    @Override // defpackage.GV
    public final ByteBuffer g(ByteBuffer byteBuffer) {
        ByteBuffer instance = byteBuffer;
        Intrinsics.checkNotNullParameter(instance, "instance");
        instance.clear();
        instance.order(ByteOrder.BIG_ENDIAN);
        return instance;
    }

    @Override // defpackage.GV
    public final ByteBuffer l() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.j);
        Intrinsics.checkNotNull(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    @Override // defpackage.GV
    public final void q(ByteBuffer byteBuffer) {
        ByteBuffer instance = byteBuffer;
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.capacity() != this.j) {
            throw new IllegalStateException("Check failed.");
        }
        if (!instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
