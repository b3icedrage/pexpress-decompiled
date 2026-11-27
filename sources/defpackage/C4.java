package defpackage;

import com.appsflyer.internal.AFf1kSDK;
import com.base.feature.robot.robot.footer.screens.RobotFooterPart;
import com.impl.feature.platform.screens.platform.PlatformFragmentImpl;
import com.impl.feature.registration.screens.forgetpassword.ForgetPasswordFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C4(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                ((G4) obj).d.b();
                return Unit.a;
            case 1:
                ((C2924bL1) obj).getClass();
                return Unit.a;
            case 2:
                Object obj2 = ((ForgetPasswordFragmentImpl) obj).i;
                Intrinsics.checkNotNull(obj2);
                ((C0664Bh0) obj2).p();
                return Unit.a;
            case 3:
                int i = PlatformFragmentImpl.H;
                Object obj3 = ((PlatformFragmentImpl) obj).i;
                Intrinsics.checkNotNull(obj3);
                C2765af1 c2765af1 = (C2765af1) obj3;
                c2765af1.getClass();
                C5189lv.k(C8056za.j(c2765af1), null, new C2560Ze1(c2765af1, null), 3);
                return Unit.a;
            case 4:
                return ((RobotFooterPart) obj).l;
            case 5:
                C1259Ix1 c1259Ix1 = (C1259Ix1) obj;
                C5189lv.k(C8056za.j(c1259Ix1), null, new C1337Jx1.c(c1259Ix1, null), 3);
                return Unit.a;
            case 6:
                return ((C2951bU1) obj).b.a();
            default:
                return Boolean.valueOf(AFf1kSDK.d((AFf1kSDK) obj));
        }
    }
}
