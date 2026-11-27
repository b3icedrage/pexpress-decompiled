package defpackage;

import com.pexpress.tool.R;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7407wT1 {

    @NotNull
    public final CQ0 a;

    public C7407wT1() {
        CQ0 cq0B = VE.b();
        cq0B.add(new BT1(R.drawable.img_stub_onboarding_1, R.string.what_is_trading_onboarding_title));
        cq0B.add(new BT1(R.drawable.img_stub_onboarding_2, R.string.learn_how_to_trade_title, EnumC7778yD0.e));
        cq0B.add(new BT1(R.drawable.img_stub_onboarding_3, R.string.what_is_trading_new_text));
        this.a = VE.a(cq0B);
    }
}
