package defpackage;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ln0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5166ln0<T> implements WM<T, AbstractC5395ms1> {
    public static final CY0 c;
    public static final Charset d;
    public final Gson a;
    public final T52<T> b;

    static {
        Pattern pattern = CY0.d;
        c = CY0.a.a("application/json; charset=UTF-8");
        d = Charset.forName("UTF-8");
    }

    public C5166ln0(Gson gson, T52<T> t52) {
        this.a = gson;
        this.b = t52;
    }

    @Override // defpackage.WM
    public final AbstractC5395ms1 a(Object obj) throws IOException {
        C1481Lu c1481Lu = new C1481Lu();
        ZH0 zh0H = this.a.h(new OutputStreamWriter(new C1559Mu(c1481Lu), d));
        this.b.b(zh0H, obj);
        zh0H.close();
        C1802Pw content = c1481Lu.X(c1481Lu.e);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        return new C4972ks1(c, content);
    }
}
