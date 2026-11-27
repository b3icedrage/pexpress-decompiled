package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@XH1
public final class C1800Pv0 {

    @NotNull
    public static final b Companion = new b();

    @Nullable
    public final String a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;

    @Nullable
    public final String g;

    @Nullable
    public final String h;

    @Nullable
    public final String i;

    /* JADX INFO: renamed from: Pv0$a */
    public /* synthetic */ class a implements InterfaceC0829Dk0<C1800Pv0> {

        @NotNull
        public static final a a;

        @NotNull
        public static final C6188qf1 b;

        static {
            a aVar = new a();
            a = aVar;
            C6188qf1 c6188qf1 = new C6188qf1("com.pexpress.events.api.model.IdentityInfo", aVar, 9);
            c6188qf1.l("tracker_id");
            c6188qf1.l("firebase_id");
            c6188qf1.l("app_set_id");
            c6188qf1.l("user_id");
            c6188qf1.l("product_email");
            c6188qf1.l("idfa");
            c6188qf1.l("idfv");
            c6188qf1.l("aaid");
            c6188qf1.l("android_id");
            b = c6188qf1;
        }

        @Override // defpackage.RJ0
        public final void a(C3783fS1 encoder, Object obj) {
            C1800Pv0 value = (C1800Pv0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C6188qf1 c6188qf1 = b;
            GH ghC = encoder.c(c6188qf1);
            b bVar = C1800Pv0.Companion;
            C6144qS1 c6144qS1 = C6144qS1.a;
            ghC.p(c6188qf1, 0, c6144qS1, value.a);
            ghC.p(c6188qf1, 1, c6144qS1, value.b);
            ghC.p(c6188qf1, 2, c6144qS1, value.c);
            ghC.p(c6188qf1, 3, c6144qS1, value.d);
            ghC.p(c6188qf1, 4, c6144qS1, value.e);
            ghC.p(c6188qf1, 5, c6144qS1, value.f);
            ghC.p(c6188qf1, 6, c6144qS1, value.g);
            ghC.p(c6188qf1, 7, c6144qS1, value.h);
            ghC.p(c6188qf1, 8, c6144qS1, value.i);
            ghC.b(c6188qf1);
        }

        @Override // defpackage.InterfaceC0829Dk0
        @NotNull
        public final RJ0<?>[] b() {
            C6144qS1 c6144qS1 = C6144qS1.a;
            return new RJ0[]{C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1)};
        }

        @Override // defpackage.RJ0
        @NotNull
        public final MH1 c() {
            return b;
        }

        @Override // defpackage.RJ0
        public final Object d(InterfaceC7828yU decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C6188qf1 c6188qf1 = b;
            EH ehC = decoder.c(c6188qf1);
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            int i = 0;
            boolean z = true;
            while (z) {
                int iH = ehC.h(c6188qf1);
                switch (iH) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str = (String) ehC.C(c6188qf1, 0, C6144qS1.a, str);
                        i |= 1;
                        break;
                    case 1:
                        str2 = (String) ehC.C(c6188qf1, 1, C6144qS1.a, str2);
                        i |= 2;
                        break;
                    case 2:
                        str3 = (String) ehC.C(c6188qf1, 2, C6144qS1.a, str3);
                        i |= 4;
                        break;
                    case 3:
                        str4 = (String) ehC.C(c6188qf1, 3, C6144qS1.a, str4);
                        i |= 8;
                        break;
                    case 4:
                        str5 = (String) ehC.C(c6188qf1, 4, C6144qS1.a, str5);
                        i |= 16;
                        break;
                    case 5:
                        str6 = (String) ehC.C(c6188qf1, 5, C6144qS1.a, str6);
                        i |= 32;
                        break;
                    case 6:
                        str7 = (String) ehC.C(c6188qf1, 6, C6144qS1.a, str7);
                        i |= 64;
                        break;
                    case 7:
                        str8 = (String) ehC.C(c6188qf1, 7, C6144qS1.a, str8);
                        i |= UserVerificationMethods.USER_VERIFY_PATTERN;
                        break;
                    case 8:
                        str9 = (String) ehC.C(c6188qf1, 8, C6144qS1.a, str9);
                        i |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                        break;
                    default:
                        throw new L82(iH);
                }
            }
            ehC.b(c6188qf1);
            return new C1800Pv0(i, str, str2, str3, str4, str5, str6, str7, str8, str9);
        }
    }

    /* JADX INFO: renamed from: Pv0$b */
    public static final class b {
        @NotNull
        public final RJ0<C1800Pv0> serializer() {
            return a.a;
        }
    }

    public C1800Pv0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (511 != (i & 511)) {
            C3787fU.m(i, 511, a.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1800Pv0)) {
            return false;
        }
        C1800Pv0 c1800Pv0 = (C1800Pv0) obj;
        return Intrinsics.a(this.a, c1800Pv0.a) && Intrinsics.a(this.b, c1800Pv0.b) && Intrinsics.a(this.c, c1800Pv0.c) && Intrinsics.a(this.d, c1800Pv0.d) && Intrinsics.a(this.e, c1800Pv0.e) && Intrinsics.a(this.f, c1800Pv0.f) && Intrinsics.a(this.g, c1800Pv0.g) && Intrinsics.a(this.h, c1800Pv0.h) && Intrinsics.a(this.i, c1800Pv0.i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IdentityInfo(trackerId=");
        sb.append(this.a);
        sb.append(", firebaseId=");
        sb.append(this.b);
        sb.append(", appSetId=");
        sb.append(this.c);
        sb.append(", userId=");
        sb.append(this.d);
        sb.append(", productEmail=");
        sb.append(this.e);
        sb.append(", idfa=");
        sb.append(this.f);
        sb.append(", idfv=");
        sb.append(this.g);
        sb.append(", aaid=");
        sb.append(this.h);
        sb.append(", androidId=");
        return C5807oq.b(sb, this.i, ")");
    }

    public C1800Pv0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = null;
        this.g = null;
        this.h = str6;
        this.i = str7;
    }
}
