package defpackage;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1437Lf implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final Object d;

    public /* synthetic */ C1437Lf(Object obj, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.d = obj;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        Object obj = this.d;
        InterfaceC1531Mk1 interfaceC1531Mk1 = this.c;
        InterfaceC1531Mk1 interfaceC1531Mk2 = this.b;
        switch (this.a) {
            case 0:
                C4923kf appData = (C4923kf) interfaceC1531Mk2.get();
                Set updaters = (Set) ((C4176hJ1) obj).get();
                InterfaceC1777Pn1 readyToStartUpdatersProvider = (InterfaceC1777Pn1) interfaceC1531Mk1.get();
                Intrinsics.checkNotNullParameter(appData, "appData");
                Intrinsics.checkNotNullParameter(updaters, "updaters");
                Intrinsics.checkNotNullParameter(readyToStartUpdatersProvider, "readyToStartUpdatersProvider");
                return new C1359Kf(appData.f, updaters, readyToStartUpdatersProvider, true);
            case 1:
                E52 customMigration = (E52) interfaceC1531Mk2.get();
                C0740Cg1 corruptionHandler = (C0740Cg1) ((InterfaceC1454Lk1) interfaceC1531Mk1).get();
                final Context context = (Context) ((C6) obj).get();
                Intrinsics.checkNotNullParameter(customMigration, "customMigration");
                Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
                Intrinsics.checkNotNullParameter(context, "context");
                final String sharedPreferencesName = context.getPackageName() + "_preferences";
                corruptionHandler.getClass();
                C1867Qr1 c1867Qr1 = new C1867Qr1(new C6178qd(1));
                LinkedHashSet keysToMigrate = C7800yK1.a;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
                Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
                return C5027l8.j(c1867Qr1, WE.f(new C7169vK1(context, sharedPreferencesName, C8010zK1.a, new C7590xK1(keysToMigrate, null), new C7380wK1(3, null)), customMigration), new Function0() { // from class: wr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return new File(context.getFilesDir(), C5807oq.b(new StringBuilder("datastore/"), sharedPreferencesName, ".preferences_pb"));
                    }
                }, 4);
            case 2:
                return new C1045Ge0((InterfaceC3951gE1) ((OW) obj).get(), (C5253mB1) interfaceC1531Mk2.get(), (InterfaceC7385wM0) interfaceC1531Mk1.get());
            default:
                C3775fQ impl = (C3775fQ) interfaceC1531Mk2.get();
                InterfaceC3706f42 telemetry = (InterfaceC3706f42) interfaceC1531Mk1.get();
                ((C7279vr) obj).getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                Intrinsics.checkNotNullParameter(telemetry, "telemetry");
                return new FX1(impl, "crypto_demo_trades_updater", null, telemetry);
        }
    }

    public C1437Lf(InterfaceC1531Mk1 interfaceC1531Mk1, C4176hJ1 c4176hJ1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = 0;
        this.b = interfaceC1531Mk1;
        this.d = c4176hJ1;
        this.c = interfaceC1531Mk2;
    }

    public C1437Lf(C7700xr c7700xr, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1454Lk1 interfaceC1454Lk1, C6 c6) {
        this.a = 1;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1454Lk1;
        this.d = c6;
    }
}
