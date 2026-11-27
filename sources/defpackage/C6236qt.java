package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.BodyProgress$handle$2", f = "BodyProgress.kt", l = {45}, m = "invokeSuspend")
public final class C6236qt extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<AbstractC5391mr0, Unit>, AbstractC5391mr0, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ AbstractC1121Hd1 e;
    public /* synthetic */ AbstractC5391mr0 g;

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC1121Hd1 abstractC1121Hd1 = this.e;
            AbstractC5391mr0 abstractC5391mr0 = this.g;
            InterfaceC1060Gj0 listener = (InterfaceC1060Gj0) abstractC5391mr0.b().c().q().e(C6445rt.b);
            if (listener == null) {
                return Unit.a;
            }
            Intrinsics.checkNotNullParameter(abstractC5391mr0, "<this>");
            Intrinsics.checkNotNullParameter(listener, "listener");
            InterfaceC0942Ew interfaceC0942EwC = abstractC5391mr0.c();
            CoroutineContext e = abstractC5391mr0.getE();
            Intrinsics.checkNotNullParameter(abstractC5391mr0, "<this>");
            InterfaceC2586Zn0 interfaceC2586Zn0A = abstractC5391mr0.a();
            List<String> list = C1159Hq0.a;
            String str = interfaceC2586Zn0A.get("Content-Length");
            InterfaceC6245qw content = C3476e.l(interfaceC0942EwC, e, str != null ? Long.valueOf(Long.parseLong(str)) : null, listener);
            C2250Vp0 originCall = abstractC5391mr0.b();
            Intrinsics.checkNotNullParameter(originCall, "<this>");
            Intrinsics.checkNotNullParameter(content, "content");
            C1782Pp0 client = originCall.d;
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(originCall, "originCall");
            PW pw = new PW(client);
            RW rw = new RW(pw, originCall.c());
            Intrinsics.checkNotNullParameter(rw, "<set-?>");
            pw.e = rw;
            SW sw = new SW(pw, content, originCall.d());
            Intrinsics.checkNotNullParameter(sw, "<set-?>");
            pw.g = sw;
            AbstractC5391mr0 abstractC5391mr0D = pw.d();
            this.e = null;
            this.d = 1;
            if (abstractC1121Hd1.d(this, abstractC5391mr0D) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(AbstractC1121Hd1<AbstractC5391mr0, Unit> abstractC1121Hd1, AbstractC5391mr0 abstractC5391mr0, JM<? super Unit> jm) {
        C6236qt c6236qt = new C6236qt(3, jm);
        c6236qt.e = abstractC1121Hd1;
        c6236qt.g = abstractC5391mr0;
        return c6236qt.invokeSuspend(Unit.a);
    }
}
