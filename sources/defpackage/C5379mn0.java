package defpackage;

import com.google.gson.Gson;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: mn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5379mn0<T> implements WM<AbstractC1091Gt1, T> {
    public final Gson a;
    public final T52<T> b;

    public C5379mn0(Gson gson, T52<T> t52) {
        this.a = gson;
        this.b = t52;
    }

    @Override // defpackage.WM
    public final Object a(AbstractC1091Gt1 abstractC1091Gt1) {
        Charset charsetA;
        AbstractC1091Gt1 abstractC1091Gt2 = abstractC1091Gt1;
        AbstractC1091Gt1.a aVar = abstractC1091Gt2.d;
        if (aVar == null) {
            InterfaceC2833av interfaceC2833avK = abstractC1091Gt2.k();
            CY0 cy0G = abstractC1091Gt2.g();
            if (cy0G == null || (charsetA = cy0G.a(Charsets.UTF_8)) == null) {
                charsetA = Charsets.UTF_8;
            }
            aVar = new AbstractC1091Gt1.a(interfaceC2833avK, charsetA);
            abstractC1091Gt2.d = aVar;
        }
        this.a.getClass();
        C7790yH0 c7790yH0 = new C7790yH0(aVar);
        c7790yH0.e = false;
        try {
            T tA = this.b.a(c7790yH0);
            if (c7790yH0.G() != JH0.n) {
                throw new C2911bH0("JSON document was not fully consumed.");
            }
            abstractC1091Gt2.close();
            return tA;
        } catch (Throwable th) {
            abstractC1091Gt2.close();
            throw th;
        }
    }
}
