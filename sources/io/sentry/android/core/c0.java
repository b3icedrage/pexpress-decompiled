package io.sentry.android.core;

import defpackage.Y0;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends Y0 {
    @Override // defpackage.Y0
    public final void e(boolean z) {
        super.e(z);
        if (z) {
            d("android.webkit.WebView");
            d("android.widget.VideoView");
            d("androidx.camera.view.PreviewView");
            d("androidx.media3.ui.PlayerView");
            d("com.google.android.exoplayer2.ui.PlayerView");
            d("com.google.android.exoplayer2.ui.StyledPlayerView");
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.a;
        copyOnWriteArraySet.remove("android.webkit.WebView");
        copyOnWriteArraySet.remove("android.widget.VideoView");
        copyOnWriteArraySet.remove("androidx.camera.view.PreviewView");
        copyOnWriteArraySet.remove("androidx.media3.ui.PlayerView");
        copyOnWriteArraySet.remove("com.google.android.exoplayer2.ui.PlayerView");
        copyOnWriteArraySet.remove("com.google.android.exoplayer2.ui.StyledPlayerView");
    }

    @Override // defpackage.Y0
    public final void g() {
    }
}
