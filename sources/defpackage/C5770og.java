package defpackage;

import com.base.feature.registration.screens.authorization.AuthorizationFragmentBase;
import com.base.feature.robot.robot.asset_selection.RobotAssetSelectionPart;
import com.base.feature.support.support.screens.popular_questions.SupportPopularQuestionsPartBase;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5770og implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C5770og(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = false;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                ((Function0) obj).invoke();
                return Unit.a;
            case 1:
                AuthorizationFragmentBase authorizationFragmentBase = (AuthorizationFragmentBase) obj;
                C7178vN1 c7178vN1 = authorizationFragmentBase.p;
                z = c7178vN1.d != null;
                InterfaceC1455Ll interfaceC1455Ll = authorizationFragmentBase.n;
                if (z) {
                    c7178vN1.E();
                    C7644xc.d(3, 0L, interfaceC1455Ll.K());
                } else {
                    C7599xN1 c7599xN1 = authorizationFragmentBase.q;
                    if (c7599xN1.d != null) {
                        c7599xN1.E();
                        C7644xc.d(3, 0L, interfaceC1455Ll.K());
                    } else {
                        Q2 q2 = authorizationFragmentBase.r.b;
                        if (q2 == null) {
                            Intrinsics.l("defaultOnBackPressed");
                            throw null;
                        }
                        q2.invoke();
                        Unit unit = Unit.a;
                    }
                }
                return Unit.a;
            case 2:
                int i = ActivityC6781tV0.Q;
                C4923kf c4923kf = ((ActivityC6781tV0) obj).m;
                if (c4923kf == null) {
                    Intrinsics.l("appDataRepository");
                    throw null;
                }
                FF ff = (FF) c4923kf.b.getValue();
                if (ff != null && ff.z.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return ((RobotAssetSelectionPart) obj).l;
            case 4:
                ((C5913pL1) obj).getClass();
                return new AbstractC1592Nf.m(R.string.login_failed_description);
            case 5:
                Object obj2 = ((SupportPopularQuestionsPartBase) obj).i;
                Intrinsics.checkNotNull(obj2);
                return new C1597Nf1(new SupportPopularQuestionsPartBase.a(1, obj2, XV1.class, "onPopularQuestionClick", "onPopularQuestionClick(Ljava/lang/String;)V", 0));
            default:
                return (Function2) ((Fg2) obj).f.n.getValue();
        }
    }
}
