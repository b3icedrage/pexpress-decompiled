package defpackage;

import com.impl.feature.robot.tradingassets.TradingAssetsBottomSheetDialogFragmentImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7542x6 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7542x6(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (Wd2) ((C7331w6) this.e).invoke();
            default:
                return (TradingAssetsBottomSheetDialogFragmentImpl) this.e;
        }
    }
}
