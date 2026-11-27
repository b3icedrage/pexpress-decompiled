package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.InputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", l = {57}, m = "invokeSuspend")
public final class C5101lW extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<Object, C3032br0>, Object, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ AbstractC1121Hd1 e;
    public /* synthetic */ Object g;

    /* JADX INFO: renamed from: lW$a */
    public static final class a extends AbstractC1112Ha1.a {

        @NotNull
        public final C4651jM a;
        public final long b;
        public final /* synthetic */ Object c;

        public a(C4651jM c4651jM, Object obj) {
            this.c = obj;
            if (c4651jM == null) {
                C4651jM c4651jM2 = C4651jM.a.a;
                c4651jM = C4651jM.a.b;
            }
            this.a = c4651jM;
            this.b = ((byte[]) obj).length;
        }

        @Override // defpackage.AbstractC1112Ha1
        @NotNull
        public final Long a() {
            return Long.valueOf(this.b);
        }

        @Override // defpackage.AbstractC1112Ha1
        @NotNull
        public final C4651jM b() {
            return this.a;
        }

        @Override // defpackage.AbstractC1112Ha1.a
        @NotNull
        public final byte[] d() {
            return (byte[]) this.c;
        }
    }

    /* JADX INFO: renamed from: lW$b */
    public static final class b extends AbstractC1112Ha1.c {

        @Nullable
        public final Long a;

        @NotNull
        public final C4651jM b;
        public final /* synthetic */ Object c;

        public b(AbstractC1121Hd1<Object, C3032br0> abstractC1121Hd1, C4651jM c4651jM, Object obj) {
            this.c = obj;
            C3441do0 c3441do0 = abstractC1121Hd1.d.c;
            List<String> list = C1159Hq0.a;
            String strF = c3441do0.f("Content-Length");
            this.a = strF != null ? Long.valueOf(Long.parseLong(strF)) : null;
            if (c4651jM == null) {
                C4651jM c4651jM2 = C4651jM.a.a;
                c4651jM = C4651jM.a.b;
            }
            this.b = c4651jM;
        }

        @Override // defpackage.AbstractC1112Ha1
        @Nullable
        public final Long a() {
            return this.a;
        }

        @Override // defpackage.AbstractC1112Ha1
        @NotNull
        public final C4651jM b() {
            return this.b;
        }

        @Override // defpackage.AbstractC1112Ha1.c
        @NotNull
        public final InterfaceC0942Ew d() {
            return (InterfaceC0942Ew) this.c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC1112Ha1 c5734oW;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC1121Hd1 abstractC1121Hd1 = this.e;
            Object body = this.g;
            C3441do0 c3441do0 = ((C3032br0) abstractC1121Hd1.d).c;
            List<String> list = C1159Hq0.a;
            String strF = c3441do0.f("Accept");
            TContext tcontext = abstractC1121Hd1.d;
            if (strF == null) {
                ((C3032br0) tcontext).c.d("Accept", "*/*");
            }
            C4651jM c4651jMB = C1548Mq0.b((InterfaceC1471Lq0) tcontext);
            if (body instanceof String) {
                String str = (String) body;
                if (c4651jMB == null) {
                    c4651jMB = C4651jM.c.a;
                }
                c5734oW = new UX1(str, c4651jMB);
            } else if (body instanceof byte[]) {
                c5734oW = new a(c4651jMB, body);
            } else if (body instanceof InterfaceC0942Ew) {
                c5734oW = new b(abstractC1121Hd1, c4651jMB, body);
            } else if (body instanceof AbstractC1112Ha1) {
                c5734oW = (AbstractC1112Ha1) body;
            } else {
                C3032br0 context = (C3032br0) tcontext;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(body, "body");
                c5734oW = body instanceof InputStream ? new C5734oW(context, c4651jMB, body) : null;
            }
            if ((c5734oW != null ? c5734oW.b() : null) != null) {
                C3032br0 c3032br0 = (C3032br0) tcontext;
                C3441do0 c3441do1 = c3032br0.c;
                c3441do1.getClass();
                Intrinsics.checkNotNullParameter("Content-Type", AppMeasurementSdk.ConditionalUserProperty.NAME);
                c3441do1.a.remove("Content-Type");
                C5524nW.a.c("Transformed with default transformers request body for " + c3032br0.a + " from " + C2017Sp1.a.b(body.getClass()));
                this.e = null;
                this.d = 1;
                if (abstractC1121Hd1.d(this, c5734oW) == mn) {
                    return mn;
                }
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
        C5101lW c5101lW = new C5101lW(3, jm);
        c5101lW.e = abstractC1121Hd1;
        c5101lW.g = obj;
        return c5101lW.invokeSuspend(Unit.a);
    }
}
