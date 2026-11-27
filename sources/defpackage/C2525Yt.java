package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Yt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2525Yt {

    @NotNull
    public final ViewGroup a;

    public C2525Yt(@NotNull ViewGroup menuView) {
        Intrinsics.checkNotNullParameter(menuView, "menuView");
        this.a = menuView;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void a(int i) {
        C42 c42M = JH1.m(new Id2(this.a), new C2447Xt(this, 0));
        Iterator it = c42M.a.iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) c42M.b.invoke((T) it.next());
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = i;
            textView.setLayoutParams(layoutParams);
            textView.setTextAlignment(4);
        }
    }
}
