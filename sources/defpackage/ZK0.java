package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ZK0 {

    public static final class a implements Runnable {
        public final /* synthetic */ b d;
        public final /* synthetic */ Exception e;

        public a(b bVar, Exception exc) {
            this.d = bVar;
            this.e = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JM jmB = C5885pC0.b(this.d);
            C1717Ot1.a aVar = C1717Ot1.e;
            jmB.resumeWith(C1795Pt1.a(this.e));
        }
    }

    @InterfaceC3368dU(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    public static final class b extends LM {
        public /* synthetic */ Object d;
        public int e;

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return ZK0.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object a(@NotNull Exception exc, @NotNull JM<?> jm) {
        b frame;
        if (jm instanceof b) {
            frame = (b) jm;
            int i = frame.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                frame.e = i - Integer.MIN_VALUE;
            } else {
                frame = new b(jm);
            }
        } else {
            frame = new b(jm);
        }
        Object obj = frame.d;
        MN mn = MN.d;
        int i2 = frame.e;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return Unit.a;
        }
        C1795Pt1.b(obj);
        frame.e = 1;
        C6266r20.a.c1(frame.getContext(), new a(frame, exc));
        Intrinsics.checkNotNullParameter(frame, "frame");
        return mn;
    }
}
