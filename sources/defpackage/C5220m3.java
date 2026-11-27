package defpackage;

import com.base.feature.account.screens.logout.AccountLogoutPartBase;
import com.base.feature.robot.robot.common_action.RobotCommonActionPart;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5220m3 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5220m3(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ?? r0 = this.e;
        switch (this.d) {
            case 0:
                return (AccountLogoutPartBase) r0;
            case 1:
                return (Wd2) ((N5) r0).invoke();
            case 2:
                return ((MQ1) ((IS) r0).j.getValue()).e();
            case 3:
                return (RobotCommonActionPart) r0;
            case 4:
                return ((Wd2) r0.getValue()).getViewModelStore();
            default:
                La2 la2 = (La2) r0;
                if (!la2.d.isEmpty()) {
                    int length = la2.a.a.length() + 3;
                    String str = la2.h;
                    int iF = StringsKt.F('/', length, 4, str);
                    if (iF != -1) {
                        int iS = StringsKt__StringsKt.s(str, new char[]{'?', '#'}, iF, false);
                        if (iS == -1) {
                            String strSubstring = str.substring(iF);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                            return strSubstring;
                        }
                        String strSubstring2 = str.substring(iF, iS);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        return strSubstring2;
                    }
                }
                return "";
        }
    }
}
