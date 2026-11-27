package defpackage;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", l = {36}, m = "invokeSuspend")
public final class C5944pW extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<C5601nr0, C2250Vp0>, C5601nr0, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ AbstractC1121Hd1 e;
    public /* synthetic */ C5601nr0 g;

    /* JADX INFO: renamed from: pW$a */
    public static final class a extends InputStream {
        public final /* synthetic */ AA0 d;
        public final /* synthetic */ AbstractC1121Hd1<C5601nr0, C2250Vp0> e;

        public a(AA0 aa0, AbstractC1121Hd1 abstractC1121Hd1) {
            this.d = aa0;
            this.e = abstractC1121Hd1;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.d.d.d();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.d.close();
            C6231qr0.b(this.e.d.d());
        }

        @Override // java.io.InputStream
        public final int read() {
            return this.d.read();
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] b, int i, int i2) {
            Intrinsics.checkNotNullParameter(b, "b");
            return this.d.read(b, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC1121Hd1 abstractC1121Hd1 = this.e;
            C5601nr0 c5601nr0 = this.g;
            A62 a62 = c5601nr0.a;
            Object obj2 = c5601nr0.b;
            if (!(obj2 instanceof InterfaceC0942Ew)) {
                return Unit.a;
            }
            if (Intrinsics.a(a62.a, C2017Sp1.a.b(InputStream.class))) {
                InterfaceC0942Ew interfaceC0942Ew = (InterfaceC0942Ew) obj2;
                XF0 xf0 = (XF0) ((C2250Vp0) abstractC1121Hd1.d).getE().p(XF0.a.d);
                KW1 kw1 = C4295ht.a;
                Intrinsics.checkNotNullParameter(interfaceC0942Ew, "<this>");
                C5601nr0 c5601nr1 = new C5601nr0(a62, new a(new AA0(xf0, interfaceC0942Ew), abstractC1121Hd1));
                this.e = null;
                this.d = 1;
                if (abstractC1121Hd1.d(this, c5601nr1) == mn) {
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
    public final Object k(AbstractC1121Hd1<C5601nr0, C2250Vp0> abstractC1121Hd1, C5601nr0 c5601nr0, JM<? super Unit> jm) {
        C5944pW c5944pW = new C5944pW(3, jm);
        c5944pW.e = abstractC1121Hd1;
        c5944pW.g = c5601nr0;
        return c5944pW.invokeSuspend(Unit.a);
    }
}
