package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7862ye extends SeekBar {
    public final C8072ze d;

    public C7862ye(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        C7211vY1.a(this, getContext());
        C8072ze c8072ze = new C8072ze(this);
        this.d = c8072ze;
        c8072ze.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C8072ze c8072ze = this.d;
        Drawable drawable = c8072ze.e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C7862ye c7862ye = c8072ze.d;
        if (drawable.setState(c7862ye.getDrawableState())) {
            c7862ye.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.d.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.d.d(canvas);
    }
}
