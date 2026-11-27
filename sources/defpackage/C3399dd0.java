package defpackage;

import com.base.feature.profileandsettings.settings.screens.SettingsFragment;
import com.base.feature.robot.robot.footer.screens.RobotFooterPart;
import com.base.feature.robot.strategyselection.screens.StrategySelectionBottomSheetDialogFragment;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: dd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3399dd0 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3399dd0(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                Object obj = C3608ed0.e;
                File file = (File) this.e;
                synchronized (obj) {
                    C3608ed0.d.remove(file.getAbsolutePath());
                }
                return Unit.a;
            case 1:
                return (Wd2) ((C5430n3) this.e).invoke();
            case 2:
                return (RobotFooterPart) this.e;
            case 3:
                return (SettingsFragment) this.e;
            case 4:
                return (StrategySelectionBottomSheetDialogFragment) this.e;
            default:
                La2 la2 = (La2) this.e;
                int iF = StringsKt.F('?', 0, 6, la2.h) + 1;
                if (iF == 0) {
                    return "";
                }
                String str = la2.h;
                int iF2 = StringsKt.F('#', iF, 4, str);
                if (iF2 == -1) {
                    String strSubstring = str.substring(iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    return strSubstring;
                }
                String strSubstring2 = str.substring(iF, iF2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
        }
    }
}
