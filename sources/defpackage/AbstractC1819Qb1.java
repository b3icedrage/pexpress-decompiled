package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Qb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1819Qb1<T> {

    /* JADX INFO: renamed from: Qb1$a */
    public static final class a<T> extends AbstractC1819Qb1<T> {
        public final Method a;
        public final int b;
        public final WM<T, AbstractC5395ms1> c;

        public a(Method method, int i, WM<T, AbstractC5395ms1> wm) {
            this.a = method;
            this.b = i;
            this.c = wm;
        }

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable T t) {
            Method method = this.a;
            int i = this.b;
            if (t == null) {
                throw Dc2.k(method, i, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                c6235qs1.k = this.c.a(t);
            } catch (IOException e) {
                throw Dc2.l(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: Qb1$b */
    public static final class b<T> extends AbstractC1819Qb1<T> {
        public final String a;
        public final WM<T, String> b;
        public final boolean c;

        public b(String str, WM<T, String> wm, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = wm;
            this.c = z;
        }

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable T t) {
            String strA;
            if (t == null || (strA = this.b.a(t)) == null) {
                return;
            }
            c6235qs1.a(this.a, strA, this.c);
        }
    }

    /* JADX INFO: renamed from: Qb1$c */
    public static final class c<T> extends AbstractC1819Qb1<Map<String, T>> {
        public final Method a;
        public final int b;
        public final WM<T, String> c;
        public final boolean d;

        public c(Method method, int i, WM<T, String> wm, boolean z) {
            this.a = method;
            this.b = i;
            this.c = wm;
            this.d = z;
        }

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable Object obj) {
            Map map = (Map) obj;
            Method method = this.a;
            int i = this.b;
            if (map == null) {
                throw Dc2.k(method, i, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Dc2.k(method, i, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Dc2.k(method, i, C1039Gc0.d("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                WM<T, String> wm = this.c;
                String strA = wm.a((T) value);
                if (strA == null) {
                    throw Dc2.k(method, i, "Field map value '" + value + "' converted to null by " + wm.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                c6235qs1.a(str, strA, this.d);
            }
        }
    }

    /* JADX INFO: renamed from: Qb1$d */
    public static final class d<T> extends AbstractC1819Qb1<T> {
        public final String a;
        public final WM<T, String> b;

        public d(String str, WM<T, String> wm) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = wm;
        }

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable T t) {
            String strA;
            if (t == null || (strA = this.b.a(t)) == null) {
                return;
            }
            c6235qs1.b(this.a, strA);
        }
    }

    /* JADX INFO: renamed from: Qb1$e */
    public static final class e<T> extends AbstractC1819Qb1<Map<String, T>> {
        public final Method a;
        public final int b;
        public final WM<T, String> c;

        public e(Method method, int i, WM<T, String> wm) {
            this.a = method;
            this.b = i;
            this.c = wm;
        }

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable Object obj) {
            Map map = (Map) obj;
            Method method = this.a;
            int i = this.b;
            if (map == null) {
                throw Dc2.k(method, i, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Dc2.k(method, i, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Dc2.k(method, i, C1039Gc0.d("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                c6235qs1.b(str, this.c.a((T) value));
            }
        }
    }

    /* JADX INFO: renamed from: Qb1$f */
    public static final class f extends AbstractC1819Qb1<C2813ao0> {
        public final Method a;
        public final int b;

        public f(int i, Method method) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable C2813ao0 c2813ao0) {
            C2813ao0 headers = c2813ao0;
            if (headers == null) {
                throw Dc2.k(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
            }
            C2813ao0.a aVar = c6235qs1.f;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                aVar.c(headers.c(i), headers.f(i));
            }
        }
    }

    /* JADX INFO: renamed from: Qb1$g */
    public static final class g<T> extends AbstractC1819Qb1<T> {
        public final Method a;
        public final int b;
        public final C2813ao0 c;
        public final WM<T, AbstractC5395ms1> d;

        public g(Method method, int i, C2813ao0 c2813ao0, WM<T, AbstractC5395ms1> wm) {
            this.a = method;
            this.b = i;
            this.c = c2813ao0;
            this.d = wm;
        }

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                c6235qs1.c(this.c, this.d.a(t));
            } catch (IOException e) {
                throw Dc2.k(this.a, this.b, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* JADX INFO: renamed from: Qb1$h */
    public static final class h<T> extends AbstractC1819Qb1<Map<String, T>> {
        public final Method a;
        public final int b;
        public final WM<T, AbstractC5395ms1> c;
        public final String d;

        public h(Method method, int i, WM<T, AbstractC5395ms1> wm, String str) {
            this.a = method;
            this.b = i;
            this.c = wm;
            this.d = str;
        }

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable Object obj) {
            Map map = (Map) obj;
            Method method = this.a;
            int i = this.b;
            if (map == null) {
                throw Dc2.k(method, i, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Dc2.k(method, i, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Dc2.k(method, i, C1039Gc0.d("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                c6235qs1.c(C2813ao0.b.c("Content-Disposition", C1039Gc0.d("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.d), this.c.a((T) value));
            }
        }
    }

    /* JADX INFO: renamed from: Qb1$i */
    public static final class i<T> extends AbstractC1819Qb1<T> {
        public final Method a;
        public final int b;
        public final String c;
        public final WM<T, String> d;
        public final boolean e;

        public i(Method method, int i, String str, WM<T, String> wm, boolean z) {
            this.a = method;
            this.b = i;
            Objects.requireNonNull(str, "name == null");
            this.c = str;
            this.d = wm;
            this.e = z;
        }

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable T t) throws EOFException {
            String strQ0;
            String str = this.c;
            if (t == null) {
                throw Dc2.k(this.a, this.b, C1039Gc0.d("Path parameter \"", str, "\" value must not be null."), new Object[0]);
            }
            String strA = this.d.a(t);
            if (c6235qs1.c == null) {
                throw new AssertionError();
            }
            int length = strA.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    strQ0 = strA;
                    break;
                }
                int iCodePointAt = strA.codePointAt(iCharCount);
                boolean z = this.e;
                int i = 47;
                int i2 = -1;
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    C1481Lu c1481Lu = new C1481Lu();
                    c1481Lu.v1(0, iCharCount, strA);
                    C1481Lu c1481Lu2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = strA.codePointAt(iCharCount);
                        if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                                if (c1481Lu2 == null) {
                                    c1481Lu2 = new C1481Lu();
                                }
                                c1481Lu2.x1(iCodePointAt2);
                                while (!c1481Lu2.t()) {
                                    byte bP = c1481Lu2.P();
                                    c1481Lu.j1(37);
                                    char[] cArr = C6235qs1.l;
                                    c1481Lu.j1(cArr[((bP & 255) >> 4) & 15]);
                                    c1481Lu.j1(cArr[bP & 15]);
                                }
                            } else {
                                c1481Lu.x1(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i = 47;
                        i2 = -1;
                    }
                    strQ0 = c1481Lu.Q0();
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strReplace = c6235qs1.c.replace("{" + str + "}", strQ0);
            if (C6235qs1.m.matcher(strReplace).matches()) {
                throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(strA));
            }
            c6235qs1.c = strReplace;
        }
    }

    /* JADX INFO: renamed from: Qb1$j */
    public static final class j<T> extends AbstractC1819Qb1<T> {
        public final String a;
        public final WM<T, String> b;
        public final boolean c;

        public j(String str, WM<T, String> wm, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = wm;
            this.c = z;
        }

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable T t) {
            String strA;
            if (t == null || (strA = this.b.a(t)) == null) {
                return;
            }
            c6235qs1.d(this.a, strA, this.c);
        }
    }

    /* JADX INFO: renamed from: Qb1$k */
    public static final class k<T> extends AbstractC1819Qb1<Map<String, T>> {
        public final Method a;
        public final int b;
        public final WM<T, String> c;
        public final boolean d;

        public k(Method method, int i, WM<T, String> wm, boolean z) {
            this.a = method;
            this.b = i;
            this.c = wm;
            this.d = z;
        }

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable Object obj) {
            Map map = (Map) obj;
            Method method = this.a;
            int i = this.b;
            if (map == null) {
                throw Dc2.k(method, i, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Dc2.k(method, i, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Dc2.k(method, i, C1039Gc0.d("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                WM<T, String> wm = this.c;
                String strA = wm.a((T) value);
                if (strA == null) {
                    throw Dc2.k(method, i, "Query map value '" + value + "' converted to null by " + wm.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                c6235qs1.d(str, strA, this.d);
            }
        }
    }

    /* JADX INFO: renamed from: Qb1$l */
    public static final class l<T> extends AbstractC1819Qb1<T> {
        public final WM<T, String> a;
        public final boolean b;

        public l(WM<T, String> wm, boolean z) {
            this.a = wm;
            this.b = z;
        }

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable T t) {
            if (t == null) {
                return;
            }
            c6235qs1.d(this.a.a(t), null, this.b);
        }
    }

    /* JADX INFO: renamed from: Qb1$m */
    public static final class m extends AbstractC1819Qb1<M11.b> {
        public static final m a = new m();

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable M11.b bVar) {
            M11.b part = bVar;
            if (part != null) {
                M11.a aVar = c6235qs1.i;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(part, "part");
                aVar.c.add(part);
            }
        }
    }

    /* JADX INFO: renamed from: Qb1$n */
    public static final class n extends AbstractC1819Qb1<Object> {
        public final Method a;
        public final int b;

        public n(int i, Method method) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable Object obj) {
            if (obj != null) {
                c6235qs1.c = obj.toString();
            } else {
                throw Dc2.k(this.a, this.b, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: Qb1$o */
    public static final class o<T> extends AbstractC1819Qb1<T> {
        public final Class<T> a;

        public o(Class<T> cls) {
            this.a = cls;
        }

        @Override // defpackage.AbstractC1819Qb1
        public final void a(C6235qs1 c6235qs1, @Nullable T t) {
            c6235qs1.e.g(this.a, t);
        }
    }

    public abstract void a(C6235qs1 c6235qs1, @Nullable T t);
}
