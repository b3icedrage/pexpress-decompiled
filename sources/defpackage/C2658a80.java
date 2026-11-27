package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: a80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@XH1
public final class C2658a80 {

    @NotNull
    public static final b Companion = new b();

    @NotNull
    public static final C2658a80 c;

    @NotNull
    public static final C2658a80 d;

    @NotNull
    public static final C2658a80 e;

    @NotNull
    public final String a;

    @NotNull
    public final JsonElement b;

    /* JADX INFO: renamed from: a80$a */
    public /* synthetic */ class a implements InterfaceC0829Dk0<C2658a80> {

        @NotNull
        public static final a a;

        @NotNull
        public static final C6188qf1 b;

        static {
            a aVar = new a();
            a = aVar;
            C6188qf1 c6188qf1 = new C6188qf1("event", aVar, 2);
            c6188qf1.l(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c6188qf1.l(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            b = c6188qf1;
        }

        @Override // defpackage.RJ0
        public final void a(C3783fS1 encoder, Object obj) {
            C2658a80 value = (C2658a80) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C6188qf1 c6188qf1 = b;
            GH ghC = encoder.c(c6188qf1);
            ghC.w(c6188qf1, 0, value.a);
            ghC.n(c6188qf1, 1, TG0.a, value.b);
            ghC.b(c6188qf1);
        }

        @Override // defpackage.InterfaceC0829Dk0
        @NotNull
        public final RJ0<?>[] b() {
            return new RJ0[]{C6144qS1.a, TG0.a};
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
            String strN = null;
            boolean z = true;
            int i = 0;
            JsonElement jsonElement = null;
            while (z) {
                int iH = ehC.h(c6188qf1);
                if (iH == -1) {
                    z = false;
                } else if (iH == 0) {
                    strN = ehC.n(c6188qf1, 0);
                    i |= 1;
                } else {
                    if (iH != 1) {
                        throw new L82(iH);
                    }
                    jsonElement = (JsonElement) ehC.r(c6188qf1, 1, TG0.a, jsonElement);
                    i |= 2;
                }
            }
            ehC.b(c6188qf1);
            return new C2658a80(i, strN, jsonElement);
        }
    }

    /* JADX INFO: renamed from: a80$b */
    public static final class b {
        @NotNull
        public final RJ0<C2658a80> serializer() {
            return a.a;
        }
    }

    static {
        JsonNull jsonNull = JsonNull.INSTANCE;
        c = new C2658a80("onBackground", jsonNull);
        d = new C2658a80("onForeground", jsonNull);
        e = new C2658a80("onStartSession", jsonNull);
    }

    public C2658a80(int i, String str, JsonElement jsonElement) {
        if (3 != (i & 3)) {
            C3787fU.m(i, 3, a.b);
            throw null;
        }
        this.a = str;
        this.b = jsonElement;
    }

    public C2658a80(String str, JsonElement jsonElement) {
        this.a = str;
        this.b = jsonElement;
    }
}
