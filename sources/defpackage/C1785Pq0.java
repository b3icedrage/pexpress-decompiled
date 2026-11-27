package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$1", f = "HttpPlainText.kt", l = {130}, m = "invokeSuspend")
public final class C1785Pq0 extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<Object, C3032br0>, Object, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ AbstractC1121Hd1 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C1707Oq0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785Pq0(C1707Oq0 c1707Oq0, JM<? super C1785Pq0> jm) {
        super(3, jm);
        this.h = c1707Oq0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Charset charset;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC1121Hd1 abstractC1121Hd1 = this.e;
            Object obj2 = this.g;
            C3032br0 context = (C3032br0) abstractC1121Hd1.d;
            C1707Oq0 c1707Oq0 = this.h;
            c1707Oq0.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            C3441do0 c3441do0 = context.c;
            List<String> list = C1159Hq0.a;
            if (c3441do0.f("Accept-Charset") == null) {
                FS0 fs0 = C2019Sq0.a;
                StringBuilder sb = new StringBuilder("Adding Accept-Charset=");
                String value = c1707Oq0.c;
                sb.append(value);
                sb.append(" to ");
                sb.append(context.a);
                fs0.c(sb.toString());
                C3441do0 c3441do1 = context.c;
                c3441do1.getClass();
                Intrinsics.checkNotNullParameter("Accept-Charset", AppMeasurementSdk.ConditionalUserProperty.NAME);
                Intrinsics.checkNotNullParameter(value, "value");
                c3441do1.h(value);
                List<String> listE = c3441do1.e("Accept-Charset");
                listE.clear();
                listE.add(value);
            }
            if (!(obj2 instanceof String)) {
                return Unit.a;
            }
            TContext tcontext = abstractC1121Hd1.d;
            C4651jM c4651jMB = C1548Mq0.b((InterfaceC1471Lq0) tcontext);
            if (c4651jMB != null) {
                if (!Intrinsics.a(c4651jMB.c, C4651jM.c.a.c)) {
                    return Unit.a;
                }
            }
            C3032br0 c3032br0 = (C3032br0) tcontext;
            String str = (String) obj2;
            C4651jM c4651jM = c4651jMB == null ? C4651jM.c.a : c4651jMB;
            if (c4651jMB == null || (charset = C5207m.d(c4651jMB)) == null) {
                charset = c1707Oq0.b;
            }
            C2019Sq0.a.c("Sending request body to " + c3032br0.a + " as text/plain with charset " + charset);
            Intrinsics.checkNotNullParameter(c4651jM, "<this>");
            Intrinsics.checkNotNullParameter(charset, "charset");
            UX1 ux1 = new UX1(str, c4651jM.c(C6927uA.d(charset)));
            this.e = null;
            this.d = 1;
            if (abstractC1121Hd1.d(this, ux1) == mn) {
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
    public final Object k(AbstractC1121Hd1<Object, C3032br0> abstractC1121Hd1, Object obj, JM<? super Unit> jm) {
        C1785Pq0 c1785Pq0 = new C1785Pq0(this.h, jm);
        c1785Pq0.e = abstractC1121Hd1;
        c1785Pq0.g = obj;
        return c1785Pq0.invokeSuspend(Unit.a);
    }
}
