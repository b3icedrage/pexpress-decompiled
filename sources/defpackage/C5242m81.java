package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: m81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5242m81 extends D7<RA> {
    @Override // defpackage.D7
    @NotNull
    public final H7<RA> a(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        C5452n81 c5452n81 = new C5452n81(itemView);
        TextView textView = (TextView) itemView.findViewById(R.id.offline);
        Context contextR = c5452n81.r();
        Integer num = C6104qF0.i.c;
        textView.setText(contextR.getString(num != null ? num.intValue() : R.string.offline_message_placeholder));
        return c5452n81;
    }
}
