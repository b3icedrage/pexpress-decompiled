package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;

/* JADX INFO: renamed from: An, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0603An implements C6973uP0.a, SuccessContinuation {
    public static String b(Class cls, String str) {
        return (str + cls).toString();
    }

    public static HashMap c(Class cls, C7886yk c7886yk) {
        HashMap map = new HashMap();
        map.put(cls, c7886yk);
        return map;
    }

    @Override // defpackage.C6973uP0.a
    public String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
