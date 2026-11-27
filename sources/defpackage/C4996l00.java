package defpackage;

import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@XH1
public final class C4996l00 {

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
    public final VD1 g;

    @NotNull
    public final UR0 h;

    /* JADX INFO: renamed from: l00$a */
    public /* synthetic */ class a implements InterfaceC0829Dk0<C4996l00> {

        @NotNull
        public static final a a;

        @NotNull
        public static final C6188qf1 b;

        static {
            a aVar = new a();
            a = aVar;
            C6188qf1 c6188qf1 = new C6188qf1("com.pexpress.events.api.model.DeviceInfo", aVar, 8);
            c6188qf1.l("id");
            c6188qf1.l("os_name");
            c6188qf1.l("type");
            c6188qf1.l("family");
            c6188qf1.l("carrier");
            c6188qf1.l("os_version");
            c6188qf1.l("screen");
            c6188qf1.l("location");
            b = c6188qf1;
        }

        @Override // defpackage.RJ0
        public final void a(C3783fS1 encoder, Object obj) {
            C4996l00 value = (C4996l00) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C6188qf1 c6188qf1 = b;
            GH ghC = encoder.c(c6188qf1);
            b bVar = C4996l00.Companion;
            C6144qS1 c6144qS1 = C6144qS1.a;
            ghC.p(c6188qf1, 0, c6144qS1, value.a);
            ghC.p(c6188qf1, 1, c6144qS1, value.b);
            ghC.p(c6188qf1, 2, c6144qS1, value.c);
            ghC.p(c6188qf1, 3, c6144qS1, value.d);
            ghC.p(c6188qf1, 4, c6144qS1, value.e);
            ghC.p(c6188qf1, 5, c6144qS1, value.f);
            ghC.p(c6188qf1, 6, VD1.a.a, value.g);
            ghC.n(c6188qf1, 7, UR0.a.a, value.h);
            ghC.b(c6188qf1);
        }

        @Override // defpackage.InterfaceC0829Dk0
        @NotNull
        public final RJ0<?>[] b() {
            C6144qS1 c6144qS1 = C6144qS1.a;
            return new RJ0[]{C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1), C1173Hv.c(VD1.a.a), UR0.a.a};
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
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            VD1 vd1 = null;
            UR0 ur0 = null;
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
                        vd1 = (VD1) ehC.C(c6188qf1, 6, VD1.a.a, vd1);
                        i |= 64;
                        break;
                    case 7:
                        ur0 = (UR0) ehC.r(c6188qf1, 7, UR0.a.a, ur0);
                        i |= UserVerificationMethods.USER_VERIFY_PATTERN;
                        break;
                    default:
                        throw new L82(iH);
                }
            }
            ehC.b(c6188qf1);
            return new C4996l00(i, str, str2, str3, str4, str5, str6, vd1, ur0);
        }
    }

    /* JADX INFO: renamed from: l00$b */
    public static final class b {
        @NotNull
        public final RJ0<C4996l00> serializer() {
            return a.a;
        }
    }

    public C4996l00(int i, String str, String str2, String str3, String str4, String str5, String str6, VD1 vd1, UR0 ur0) {
        if (255 != (i & 255)) {
            C3787fU.m(i, 255, a.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = vd1;
        this.h = ur0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4996l00)) {
            return false;
        }
        C4996l00 c4996l00 = (C4996l00) obj;
        return Intrinsics.a(this.a, c4996l00.a) && Intrinsics.a(this.b, c4996l00.b) && Intrinsics.a(this.c, c4996l00.c) && Intrinsics.a(this.d, c4996l00.d) && Intrinsics.a(this.e, c4996l00.e) && Intrinsics.a(this.f, c4996l00.f) && Intrinsics.a(this.g, c4996l00.g) && Intrinsics.a(this.h, c4996l00.h);
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
        VD1 vd1 = this.g;
        return this.h.hashCode() + ((iHashCode6 + (vd1 != null ? vd1.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "DeviceInfo(deviceId=" + this.a + ", platform=" + this.b + ", deviceType=" + this.c + ", deviceFamily=" + this.d + ", carrier=" + this.e + ", OS=" + this.f + ", screen=" + this.g + ", location=" + this.h + ")";
    }

    public C4996l00(@Nullable String str, @Nullable String str2, @Nullable VD1 vd1, @NotNull UR0 location) {
        String str3 = Build.MANUFACTURER;
        String str4 = Build.MODEL;
        String str5 = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullParameter(location, "location");
        this.a = str;
        this.b = "android";
        this.c = str3;
        this.d = str4;
        this.e = str2;
        this.f = str5;
        this.g = vd1;
        this.h = location;
    }
}
