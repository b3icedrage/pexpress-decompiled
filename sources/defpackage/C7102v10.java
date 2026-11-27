package defpackage;

import android.content.Context;
import android.view.VelocityTracker;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: v10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7102v10 {
    public final Context a;
    public final NestedScrollView.c b;
    public VelocityTracker c;
    public float d;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public final int[] h = {Api.BaseClientBuilder.API_PRIORITY_OTHER, 0};

    public C7102v10(@NonNull Context context, @NonNull NestedScrollView.c cVar) {
        this.a = context;
        this.b = cVar;
    }
}
