package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5663o82 implements Executor {
    public static final EnumC5663o82 d;

    @SuppressLint({"ThreadPoolCreation"})
    public static final Handler e;
    public static final /* synthetic */ EnumC5663o82[] g;

    static {
        EnumC5663o82 enumC5663o82 = new EnumC5663o82("INSTANCE", 0);
        d = enumC5663o82;
        g = new EnumC5663o82[]{enumC5663o82};
        e = new Handler(Looper.getMainLooper());
    }

    public EnumC5663o82() {
        throw null;
    }

    public static EnumC5663o82 valueOf(String str) {
        return (EnumC5663o82) Enum.valueOf(EnumC5663o82.class, str);
    }

    public static EnumC5663o82[] values() {
        return (EnumC5663o82[]) g.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e.post(runnable);
    }
}
