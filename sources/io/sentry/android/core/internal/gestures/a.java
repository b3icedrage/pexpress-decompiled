package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.util.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements io.sentry.internal.gestures.a {

    @NotNull
    public final l<Boolean> a;

    public a(@NotNull l<Boolean> lVar) {
        this.a = lVar;
    }

    @Override // io.sentry.internal.gestures.a
    @Nullable
    public final io.sentry.internal.gestures.b a(@Nullable View view, io.sentry.internal.gestures.b.a aVar) {
        if (view != null) {
            if (aVar == io.sentry.internal.gestures.b.a.CLICKABLE && view.isClickable() && view.getVisibility() == 0) {
                try {
                    return new io.sentry.internal.gestures.b(view, io.sentry.android.core.internal.util.f.a(view), h.b(view));
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            }
            if (aVar == io.sentry.internal.gestures.b.a.SCROLLABLE) {
                boolean z = false;
                if (((!this.a.a().booleanValue() ? false : ScrollingView.class.isAssignableFrom(view.getClass())) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0) {
                    z = true;
                }
                if (z) {
                    try {
                        return new io.sentry.internal.gestures.b(view, io.sentry.android.core.internal.util.f.a(view), h.b(view));
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
            }
        }
        return null;
    }
}
