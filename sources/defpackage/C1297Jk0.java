package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: Jk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1297Jk0 implements JP1 {
    public final Bc2 a;
    public final TaskCompletionSource<RA0> b;

    public C1297Jk0(Bc2 bc2, TaskCompletionSource<RA0> taskCompletionSource) {
        this.a = bc2;
        this.b = taskCompletionSource;
    }

    @Override // defpackage.JP1
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // defpackage.JP1
    public final boolean b(C0996Fo c0996Fo) {
        if (c0996Fo.f() != C7019ud1.a.h || this.a.a(c0996Fo)) {
            return false;
        }
        String str = c0996Fo.d;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.b.setResult(new C7901yo(c0996Fo.f, c0996Fo.g, str));
        return true;
    }
}
