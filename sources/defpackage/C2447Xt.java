package defpackage;

import android.view.View;
import android.widget.TextView;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2447Xt implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C2447Xt(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                View itemView = (View) obj;
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                ((C2525Yt) this.e).getClass();
                TextView textView = (TextView) itemView.findViewById(R.id.navigation_bar_item_small_label_view);
                Intrinsics.checkNotNull(textView);
                if (textView.getVisibility() == 0) {
                    return textView;
                }
                View viewFindViewById = itemView.findViewById(R.id.navigation_bar_item_large_label_view);
                Intrinsics.checkNotNull(viewFindViewById);
                return (TextView) viewFindViewById;
            default:
                MI Amplitude = (MI) obj;
                Intrinsics.checkNotNullParameter(Amplitude, "$this$Amplitude");
                Amplitude.r = (String) this.e;
                return Unit.a;
        }
    }
}
