package defpackage;

import android.view.View;
import com.base.feature.robot.indicatorselection.screens.shared.UnlockIndicatorsBottomSheetFragment;

/* JADX INFO: renamed from: By, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0714By implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ ViewOnClickListenerC0714By(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                AbstractC1104Gy abstractC1104Gy = (AbstractC1104Gy) this.e;
                C1571My c1571My = (C1571My) this.g;
                C2316Wk c2316Wk = abstractC1104Gy.o;
                if (c2316Wk != null) {
                    int i = c2316Wk.e + 1;
                    c2316Wk.e = i;
                    c2316Wk.b.b("captcha.refreshes", String.valueOf(i));
                }
                c1571My.g.loadUrl((String) abstractC1104Gy.m.getValue());
                break;
            default:
                ((UnlockIndicatorsBottomSheetFragment) this.e).dismiss();
                ((W82) this.g).d.invoke();
                break;
        }
    }
}
