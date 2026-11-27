package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zi2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8091zi2 extends D7<RA> {
    @Override // defpackage.D7
    @NotNull
    public final H7<RA> a(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Ai2 ai2 = new Ai2(itemView);
        TextView textView = (TextView) itemView.findViewById(R.id.welcome);
        Context contextR = ai2.r();
        Integer num = C6104qF0.i.a;
        textView.setText(contextR.getString(num != null ? num.intValue() : R.string.welcome_message_placeholder));
        return ai2;
    }
}
