package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Z72 {

    @NotNull
    public static final La2 k;

    @NotNull
    public C3722f82 a;

    @NotNull
    public String b;
    public int c;
    public boolean d;

    @Nullable
    public String e;

    @Nullable
    public String f;

    @NotNull
    public String g;

    @NotNull
    public List<String> h;

    @NotNull
    public C2291Wb1 i;

    @NotNull
    public Ma2 j;

    public static final class a {
    }

    static {
        Intrinsics.checkNotNullParameter(new a(), "<this>");
        Intrinsics.checkNotNullParameter("http://localhost", "urlString");
        Intrinsics.checkNotNullParameter("http://localhost", "urlString");
        k = C3512e82.b(new Z72(0), "http://localhost").b();
    }

    public Z72(int i) {
        C3722f82 protocol = C3722f82.c;
        C5653o60 pathSegments = C5653o60.d;
        InterfaceC2131Ub1.b.getClass();
        C6282r60 parameters = C6282r60.c;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter("", "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter("", "fragment");
        this.a = protocol;
        this.b = "";
        this.c = 0;
        this.d = false;
        this.e = null;
        this.f = null;
        Set<Byte> set = BE.a;
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter("", "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
        BE.g(C7279vr.c(charsetEncoderNewEncoder, "", 0, "".length()), new C3837fi(sb, 1));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.g = string;
        ArrayList arrayList = new ArrayList(XE.m(pathSegments, 10));
        C5443n60 c5443n60 = C5443n60.d;
        c5443n60.getClass();
        this.h = arrayList;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        C2291Wb1 c2291Wb1 = new C2291Wb1();
        C6702t60.d.getClass();
        c5443n60.getClass();
        this.i = c2291Wb1;
        this.j = new Ma2(c2291Wb1);
    }

    public final void a() {
        if (this.b.length() <= 0 && !Intrinsics.a(this.a.a, "file")) {
            La2 la2 = k;
            this.b = la2.b;
            C3722f82 c3722f82 = this.a;
            C3722f82 c3722f83 = C3722f82.c;
            if (Intrinsics.a(c3722f82, C3722f82.c)) {
                this.a = la2.a;
            }
            if (this.c == 0) {
                this.c = la2.c;
            }
        }
    }

    @NotNull
    public final La2 b() {
        a();
        C3722f82 c3722f82 = this.a;
        String str = this.b;
        int i = this.c;
        List<String> list = this.h;
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(BE.d((String) it.next()));
        }
        InterfaceC2131Ub1 interfaceC2131Ub1L = C0957Fb.l(this.j.a);
        String strE = BE.e(this.g, 0, 0, 15);
        String str2 = this.e;
        String strD = str2 != null ? BE.d(str2) : null;
        String str3 = this.f;
        String strD2 = str3 != null ? BE.d(str3) : null;
        a();
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        C4466ii.d(this, sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "appendTo(StringBuilder(256)).toString()");
        return new La2(c3722f82, str, i, arrayList, interfaceC2131Ub1L, strE, strD, strD2, string);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        C4466ii.d(this, sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "appendTo(StringBuilder(256)).toString()");
        return string;
    }
}
