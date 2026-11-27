package defpackage;

import io.jsonwebtoken.Header;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4651jM extends AbstractC2430Xn0 {

    @NotNull
    public static final C4651jM e = new C4651jM("*", "*", C5653o60.d);

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    /* JADX INFO: renamed from: jM$a */
    public static final class a {

        @NotNull
        public static final C4651jM a;

        @NotNull
        public static final C4651jM b;

        static {
            C5653o60 c5653o60 = C5653o60.d;
            new C4651jM("application", "*", c5653o60);
            new C4651jM("application", "atom+xml", c5653o60);
            new C4651jM("application", "cbor", c5653o60);
            a = new C4651jM("application", "json", c5653o60);
            new C4651jM("application", "hal+json", c5653o60);
            new C4651jM("application", "javascript", c5653o60);
            b = new C4651jM("application", "octet-stream", c5653o60);
            new C4651jM("application", "rss+xml", c5653o60);
            new C4651jM("application", "xml", c5653o60);
            new C4651jM("application", "xml-dtd", c5653o60);
            new C4651jM("application", Header.COMPRESSION_ALGORITHM, c5653o60);
            new C4651jM("application", "gzip", c5653o60);
            new C4651jM("application", "x-www-form-urlencoded", c5653o60);
            new C4651jM("application", "pdf", c5653o60);
            new C4651jM("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", c5653o60);
            new C4651jM("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", c5653o60);
            new C4651jM("application", "vnd.openxmlformats-officedocument.presentationml.presentation", c5653o60);
            new C4651jM("application", "protobuf", c5653o60);
            new C4651jM("application", "wasm", c5653o60);
            new C4651jM("application", "problem+json", c5653o60);
            new C4651jM("application", "problem+xml", c5653o60);
        }
    }

    /* JADX INFO: renamed from: jM$b */
    public static final class b {
        @NotNull
        public static C4651jM a(@NotNull String value) throws C1703Op {
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt.I(value)) {
                return C4651jM.e;
            }
            C2244Vn0 c2244Vn0 = (C2244Vn0) CollectionsKt.L(C1003Fq0.a(value));
            String str = c2244Vn0.a;
            int iF = StringsKt.F('/', 0, 6, str);
            if (iF == -1) {
                if (Intrinsics.a(StringsKt.d0(str).toString(), "*")) {
                    return C4651jM.e;
                }
                throw new C1703Op(value);
            }
            String strSubstring = str.substring(0, iF);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = StringsKt.d0(strSubstring).toString();
            if (string.length() == 0) {
                throw new C1703Op(value);
            }
            String strSubstring2 = str.substring(iF + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            String string2 = StringsKt.d0(strSubstring2).toString();
            if (StringsKt.D(string, ' ') || StringsKt.D(string2, ' ')) {
                throw new C1703Op(value);
            }
            if (string2.length() == 0 || StringsKt.D(string2, '/')) {
                throw new C1703Op(value);
            }
            return new C4651jM(string, string2, c2244Vn0.b);
        }
    }

    /* JADX INFO: renamed from: jM$c */
    public static final class c {

        @NotNull
        public static final C4651jM a;

        static {
            C5653o60 c5653o60 = C5653o60.d;
            new C4651jM("text", "*", c5653o60);
            a = new C4651jM("text", "plain", c5653o60);
            new C4651jM("text", "css", c5653o60);
            new C4651jM("text", "csv", c5653o60);
            new C4651jM("text", C2271Vw0.HTML, c5653o60);
            new C4651jM("text", "javascript", c5653o60);
            new C4651jM("text", "vcard", c5653o60);
            new C4651jM("text", "xml", c5653o60);
            new C4651jM("text", "event-stream", c5653o60);
        }
    }

    public C4651jM(String str, String str2, String str3, List<C2326Wn0> list) {
        super(str3, list);
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public final boolean b(@NotNull C4651jM pattern) {
        boolean zI;
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (Intrinsics.a(pattern.c, "*") || d.i(pattern.c, this.c)) {
            String str = pattern.d;
            if (Intrinsics.a(str, "*") || d.i(str, this.d)) {
                Iterator<C2326Wn0> it = pattern.b.iterator();
                do {
                    zI = true;
                    if (!it.hasNext()) {
                        return true;
                    }
                    C2326Wn0 next = it.next();
                    String str2 = next.a;
                    boolean zA = Intrinsics.a(str2, "*");
                    String str3 = next.b;
                    if (!zA) {
                        String strA = a(str2);
                        if (!Intrinsics.a(str3, "*")) {
                            zI = d.i(strA, str3);
                        } else if (strA == null) {
                            zI = false;
                            break;
                            break;
                        }
                    } else if (!Intrinsics.a(str3, "*")) {
                        List<C2326Wn0> list = this.b;
                        if (list != null && list.isEmpty()) {
                            zI = false;
                            break;
                            break;
                        }
                        Iterator<T> it2 = list.iterator();
                        do {
                            if (!it2.hasNext()) {
                                zI = false;
                                break;
                            }
                        } while (!d.i(((C2326Wn0) it2.next()).b, str3));
                    }
                } while (zI);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (kotlin.text.d.i(r2.b, r6) != false) goto L21;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C4651jM c(@org.jetbrains.annotations.NotNull java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            java.lang.String r1 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.List<Wn0> r0 = r5.b
            int r2 = r0.size()
            if (r2 == 0) goto L57
            r3 = 1
            if (r2 == r3) goto L3f
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1e
            goto L57
        L1e:
            java.util.Iterator r2 = r0.iterator()
        L22:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r2.next()
            Wn0 r3 = (defpackage.C2326Wn0) r3
            java.lang.String r4 = r3.a
            boolean r4 = kotlin.text.d.i(r4, r1)
            if (r4 == 0) goto L22
            java.lang.String r3 = r3.b
            boolean r3 = kotlin.text.d.i(r3, r6)
            if (r3 == 0) goto L22
            goto L56
        L3f:
            r2 = 0
            java.lang.Object r2 = r0.get(r2)
            Wn0 r2 = (defpackage.C2326Wn0) r2
            java.lang.String r3 = r2.a
            boolean r3 = kotlin.text.d.i(r3, r1)
            if (r3 == 0) goto L57
            java.lang.String r2 = r2.b
            boolean r2 = kotlin.text.d.i(r2, r6)
            if (r2 == 0) goto L57
        L56:
            return r5
        L57:
            jM r2 = new jM
            Wn0 r3 = new Wn0
            r3.<init>(r1, r6)
            java.util.ArrayList r6 = kotlin.collections.CollectionsKt.R(r0, r3)
            java.lang.String r0 = r5.d
            java.lang.String r1 = r5.a
            java.lang.String r3 = r5.c
            r2.<init>(r3, r0, r1, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4651jM.c(java.lang.String):jM");
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C4651jM)) {
            return false;
        }
        C4651jM c4651jM = (C4651jM) obj;
        return d.i(this.c, c4651jM.c) && d.i(this.d, c4651jM.d) && Intrinsics.a(this.b, c4651jM.b);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.c.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.d.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return (this.b.hashCode() * 31) + lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4651jM(@NotNull String contentType, @NotNull String contentSubtype, @NotNull List<C2326Wn0> parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(contentSubtype, "contentSubtype");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }
}
