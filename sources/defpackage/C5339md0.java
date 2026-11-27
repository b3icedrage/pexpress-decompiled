package defpackage;

import io.sentry.instrumentation.file.j;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: md0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5339md0<T> extends C2397Xc0<T> implements InterfaceC4950kl2<T> {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC4950kl2
    @Nullable
    public final Object a(Object obj, @NotNull LM lm) {
        C5126ld0 c5126ld0;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (lm instanceof C5126ld0) {
            c5126ld0 = (C5126ld0) lm;
            int i = c5126ld0.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5126ld0.i = i - Integer.MIN_VALUE;
            } else {
                c5126ld0 = new C5126ld0(this, lm);
            }
        } else {
            c5126ld0 = new C5126ld0(this, lm);
        }
        Object obj2 = c5126ld0.g;
        MN mn = MN.d;
        int i2 = c5126ld0.i;
        if (i2 == 0) {
            C1795Pt1.b(obj2);
            if (this.c.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            File file = this.a;
            FileOutputStream fileOutputStreamB = j.a.b(new FileOutputStream(file), file);
            try {
                C0974Fg1 c0974Fg1 = this.b;
                C6922u82 c6922u82 = new C6922u82(fileOutputStreamB);
                c5126ld0.d = fileOutputStreamB;
                c5126ld0.e = fileOutputStreamB;
                c5126ld0.i = 1;
                if (c0974Fg1.b(obj, c6922u82) == mn) {
                    return mn;
                }
                fileOutputStream2 = fileOutputStreamB;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStreamB;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = c5126ld0.e;
            fileOutputStream = c5126ld0.d;
            try {
                C1795Pt1.b(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    C6621sj.b(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        Unit unit = Unit.a;
        C6621sj.b(fileOutputStream, null);
        return Unit.a;
    }
}
