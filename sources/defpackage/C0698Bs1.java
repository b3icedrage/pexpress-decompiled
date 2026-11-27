package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: Bs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0698Bs1 {
    public final Method a;
    public final C1318Jr0 b;
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final C2813ao0 e;

    @Nullable
    public final CY0 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final AbstractC1819Qb1<?>[] j;
    public final boolean k;

    /* JADX INFO: renamed from: Bs1$a */
    public static final class a {
        public static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        public final C2263Vt1 a;
        public final Method b;
        public final Annotation[] c;
        public final Annotation[][] d;
        public final Type[] e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;

        @Nullable
        public String n;
        public boolean o;
        public boolean p;
        public boolean q;

        @Nullable
        public String r;

        @Nullable
        public C2813ao0 s;

        @Nullable
        public CY0 t;

        @Nullable
        public LinkedHashSet u;

        @Nullable
        public AbstractC1819Qb1<?>[] v;
        public boolean w;

        public a(C2263Vt1 c2263Vt1, Method method) {
            this.a = c2263Vt1;
            this.b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z) {
            String str3 = this.n;
            Method method = this.b;
            if (str3 != null) {
                throw Dc2.j(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.n = str;
            this.o = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            Pattern pattern = x;
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (pattern.matcher(strSubstring).find()) {
                    throw Dc2.j(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.r = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.u = linkedHashSet;
        }

        public final void c(int i, Type type) {
            if (Dc2.h(type)) {
                throw Dc2.k(this.b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C0698Bs1(a aVar) {
        this.a = aVar.b;
        this.b = aVar.a.c;
        this.c = aVar.n;
        this.d = aVar.r;
        this.e = aVar.s;
        this.f = aVar.t;
        this.g = aVar.o;
        this.h = aVar.p;
        this.i = aVar.q;
        this.j = aVar.v;
        this.k = aVar.w;
    }
}
