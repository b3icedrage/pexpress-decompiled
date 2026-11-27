package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class P71 {
    public static final int a;

    @NotNull
    public static final C7733y10 b;

    @NotNull
    public static final b c;

    @NotNull
    public static final a d;

    public static final class a extends AbstractC5860p51<AbstractC1229In1.c> {
        @Override // defpackage.O71
        public final Object S() {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(P71.a);
            Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "allocateDirect(BUFFER_SIZE)");
            return new AbstractC1229In1.c(byteBufferAllocateDirect);
        }
    }

    public static final class b extends GV<AbstractC1229In1.c> {
        @Override // defpackage.GV
        public final void k(AbstractC1229In1.c cVar) {
            AbstractC1229In1.c instance = cVar;
            Intrinsics.checkNotNullParameter(instance, "instance");
            P71.b.g1(instance.a);
        }

        @Override // defpackage.GV
        public final AbstractC1229In1.c l() {
            return new AbstractC1229In1.c(P71.b.S());
        }
    }

    static {
        int iO = UE.o(4096, "BufferSize");
        a = iO;
        int iO2 = UE.o(2048, "BufferPoolSize");
        int iO3 = UE.o(UserVerificationMethods.USER_VERIFY_ALL, "BufferObjectPoolSize");
        b = new C7733y10(iO2, iO);
        c = new b(iO3);
        d = new a();
    }
}
