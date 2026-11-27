package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.base.feature.alertdialog.screen.StarViewGroup;
import com.jivosite.sdk.ui.views.JivoRatingBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class VF0 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewGroup g;

    public /* synthetic */ VF0(ViewGroup viewGroup, int i, int i2) {
        this.d = i2;
        this.g = viewGroup;
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.e;
        ViewGroup viewGroup = this.g;
        switch (this.d) {
            case 0:
                int i2 = JivoRatingBar.z;
                JivoRatingBar this$0 = (JivoRatingBar) viewGroup;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1<? super String, Unit> function1 = this$0.y;
                if (function1 != null) {
                    String str = this$0.x;
                    String str2 = "bad";
                    if (Intrinsics.a(str, "two")) {
                        if (i == 0) {
                            str2 = "good";
                        }
                    } else if (Intrinsics.a(str, "three")) {
                        if (i != 0) {
                            if (i != 1) {
                                str2 = "good";
                            } else {
                                str2 = "normal";
                            }
                        }
                    } else if (i != 0) {
                        if (i == 1) {
                            str2 = "badnormal";
                        } else if (i == 2) {
                            str2 = "normal";
                        } else if (i != 3) {
                            str2 = "good";
                        } else {
                            str2 = "goodnormal";
                        }
                    }
                    function1.invoke(str2);
                }
                break;
            default:
                StarViewGroup.a((StarViewGroup) viewGroup, i);
                break;
        }
    }
}
