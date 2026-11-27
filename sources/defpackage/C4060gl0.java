package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: gl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4060gl0 implements JP1 {
    public final TaskCompletionSource<String> a;

    public C4060gl0(TaskCompletionSource<String> taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // defpackage.JP1
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.JP1
    public final boolean b(C0996Fo c0996Fo) {
        if (c0996Fo.f() != C7019ud1.a.g && c0996Fo.f() != C7019ud1.a.h && c0996Fo.f() != C7019ud1.a.i) {
            return false;
        }
        this.a.trySetResult(c0996Fo.b);
        return true;
    }
}
