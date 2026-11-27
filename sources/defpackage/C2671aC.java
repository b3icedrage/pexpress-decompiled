package defpackage;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.a;

/* JADX INFO: renamed from: aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2671aC extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public C2671aC(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public final void getOutline(View view, @NonNull Outline outline) {
        a aVar = this.a.i;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
