package defpackage;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: Sg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1989Sg0 {
    public final AssetManager d;
    public final X11<String> a = new X11<>();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public String e = ".ttf";

    public C1989Sg0(Drawable.Callback callback) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            CS0.b("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }
}
