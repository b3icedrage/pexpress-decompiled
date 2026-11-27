package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6235qs1 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final C1318Jr0 b;

    @Nullable
    public String c;

    @Nullable
    public C1318Jr0.a d;
    public final C4543is1.a e = new C4543is1.a();
    public final C2813ao0.a f;

    @Nullable
    public CY0 g;
    public final boolean h;

    @Nullable
    public final M11.a i;

    @Nullable
    public final C0898Eh0.a j;

    @Nullable
    public AbstractC5395ms1 k;

    /* JADX INFO: renamed from: qs1$a */
    public static class a extends AbstractC5395ms1 {
        public final AbstractC5395ms1 a;
        public final CY0 b;

        public a(AbstractC5395ms1 abstractC5395ms1, CY0 cy0) {
            this.a = abstractC5395ms1;
            this.b = cy0;
        }

        @Override // defpackage.AbstractC5395ms1
        public final long a() {
            return this.a.a();
        }

        @Override // defpackage.AbstractC5395ms1
        public final CY0 b() {
            return this.b;
        }

        @Override // defpackage.AbstractC5395ms1
        public final void c(InterfaceC2606Zu interfaceC2606Zu) {
            this.a.c(interfaceC2606Zu);
        }
    }

    public C6235qs1(String str, C1318Jr0 c1318Jr0, @Nullable String str2, @Nullable C2813ao0 c2813ao0, @Nullable CY0 cy0, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = c1318Jr0;
        this.c = str2;
        this.g = cy0;
        this.h = z;
        if (c2813ao0 != null) {
            this.f = c2813ao0.d();
        } else {
            this.f = new C2813ao0.a();
        }
        if (z2) {
            this.j = new C0898Eh0.a();
            return;
        }
        if (z3) {
            M11.a aVar = new M11.a();
            this.i = aVar;
            CY0 type = M11.f;
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.a(type.b, "multipart")) {
                aVar.b = type;
            } else {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
        }
    }

    public final void a(String name, String value, boolean z) {
        C0898Eh0.a aVar = this.j;
        if (z) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            aVar.a.add(C1318Jr0.b.a(0, 0, 83, name, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
            aVar.b.add(C1318Jr0.b.a(0, 0, 83, value, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
            return;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        aVar.a.add(C1318Jr0.b.a(0, 0, 91, name, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
        aVar.b.add(C1318Jr0.b.a(0, 0, 91, value, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
    }

    public final void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f.a(str, str2);
            return;
        }
        try {
            Pattern pattern = CY0.d;
            this.g = CY0.a.a(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(C5491nL.c("Malformed content type: ", str2), e);
        }
    }

    public final void c(C2813ao0 c2813ao0, AbstractC5395ms1 body) {
        M11.a aVar = this.i;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(body, "body");
        if (c2813ao0.b("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c2813ao0.b("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        M11.b part = new M11.b(c2813ao0, body);
        Intrinsics.checkNotNullParameter(part, "part");
        aVar.c.add(part);
    }

    public final void d(String name, @Nullable String str, boolean z) {
        String str2 = this.c;
        if (str2 != null) {
            C1318Jr0 c1318Jr0 = this.b;
            C1318Jr0.a aVarG = c1318Jr0.g(str2);
            this.d = aVarG;
            if (aVarG == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c1318Jr0 + ", Relative: " + this.c);
            }
            this.c = null;
        }
        if (z) {
            C1318Jr0.a aVar = this.d;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(name, "encodedName");
            if (aVar.g == null) {
                aVar.g = new ArrayList();
            }
            ArrayList arrayList = aVar.g;
            Intrinsics.checkNotNull(arrayList);
            arrayList.add(C1318Jr0.b.a(0, 0, 211, name, " \"'<>#&="));
            ArrayList arrayList2 = aVar.g;
            Intrinsics.checkNotNull(arrayList2);
            arrayList2.add(str != null ? C1318Jr0.b.a(0, 0, 211, str, " \"'<>#&=") : null);
            return;
        }
        C1318Jr0.a aVar2 = this.d;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        if (aVar2.g == null) {
            aVar2.g = new ArrayList();
        }
        ArrayList arrayList3 = aVar2.g;
        Intrinsics.checkNotNull(arrayList3);
        arrayList3.add(C1318Jr0.b.a(0, 0, 219, name, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList4 = aVar2.g;
        Intrinsics.checkNotNull(arrayList4);
        arrayList4.add(str != null ? C1318Jr0.b.a(0, 0, 219, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }
}
