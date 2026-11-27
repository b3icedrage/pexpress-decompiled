package defpackage;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: renamed from: bX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class C2960bX1 {
    public final ComponentName a;

    static {
        AS0.d("SystemJobInfoConverter");
    }

    public C2960bX1(@NonNull Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
