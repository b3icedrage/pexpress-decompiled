package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RU extends GV<C2895bC> {
    public final int j;

    @NotNull
    public final C3476e k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RU() {
        super(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        C3476e allocator = C3476e.e;
        Intrinsics.checkNotNullParameter(allocator, "allocator");
        this.j = 4096;
        this.k = allocator;
    }

    @Override // defpackage.GV
    public final C2895bC g(C2895bC c2895bC) {
        C2895bC instance = c2895bC;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(instance, "instance");
        instance.l();
        instance.j();
        return instance;
    }

    @Override // defpackage.GV
    public final void k(C2895bC c2895bC) {
        C2895bC instance = c2895bC;
        Intrinsics.checkNotNullParameter(instance, "instance");
        ByteBuffer instance2 = instance.a;
        this.k.getClass();
        Intrinsics.checkNotNullParameter(instance2, "instance");
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (!C2895bC.j.compareAndSet(instance, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        instance.f();
        instance.h = null;
    }

    @Override // defpackage.GV
    public final C2895bC l() {
        C3476e c3476e = this.k;
        int i = this.j;
        c3476e.getClass();
        ByteBuffer buffer = ByteBuffer.allocate(i);
        Intrinsics.checkNotNullExpressionValue(buffer, "allocate(size)");
        ByteBuffer byteBuffer = WY0.a;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return new C2895bC(buffer, null, this);
    }

    @Override // defpackage.GV
    public final void q(C2895bC c2895bC) {
        C2895bC instance = c2895bC;
        Intrinsics.checkNotNullParameter(instance, "instance");
        super.q(instance);
        ByteBuffer byteBuffer = instance.a;
        long jLimit = byteBuffer.limit();
        int i = this.j;
        if (jLimit != i) {
            StringBuilder sbC = C1332Jw.c(i, "Buffer size mismatch. Expected: ", ", actual: ");
            sbC.append(byteBuffer.limit());
            throw new IllegalStateException(sbC.toString().toString());
        }
        C2895bC c2895bC2 = C2895bC.l;
        if (instance == c2895bC2) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled");
        }
        if (instance == c2895bC2) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        if (instance.h() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.");
        }
        if (instance.g() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.");
        }
        if (instance.h != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.");
        }
    }
}
