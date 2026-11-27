package defpackage;

import defpackage.IY1;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class HY1<T extends IY1 & Comparable<? super T>> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(HY1.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    @Nullable
    public T[] a;

    public final void a(@NotNull B80.c cVar) {
        cVar.f((B80.d) this);
        T[] tArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (tArr == null) {
            tArr = (T[]) new IY1[4];
            this.a = tArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(tArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            tArr = (T[]) ((IY1[]) objArrCopyOf);
            this.a = tArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        tArr[i] = cVar;
        cVar.e = i;
        c(i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b A[LOOP:0: B:9:0x003c->B:21:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[EDGE_INSN: B:24:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:9:0x003c->B:21:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[EDGE_INSN: B:25:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:9:0x003c->B:21:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    @NotNull
    public final T b(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        T[] tArr = this.a;
        Intrinsics.checkNotNull(tArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                Object obj5 = tArr[i];
                Intrinsics.checkNotNull(obj5);
                Object obj6 = tArr[i5];
                Intrinsics.checkNotNull(obj6);
                if (((Comparable) obj5).compareTo(obj6) < 0) {
                    d(i, i5);
                    c(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.a;
                        Intrinsics.checkNotNull(objArr);
                        i4 = i2 + 2;
                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
                            obj3 = objArr[i4];
                            Intrinsics.checkNotNull(obj3);
                            obj4 = objArr[i3];
                            Intrinsics.checkNotNull(obj4);
                            if (((Comparable) obj3).compareTo(obj4) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        obj = objArr[i];
                        Intrinsics.checkNotNull(obj);
                        obj2 = objArr[i4];
                        Intrinsics.checkNotNull(obj2);
                        if (((Comparable) obj).compareTo(obj2) <= 0) {
                            break;
                        }
                        d(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    Intrinsics.checkNotNull(objArr);
                    i4 = i2 + 2;
                    if (i4 < atomicIntegerFieldUpdater.get(this)) {
                        obj3 = objArr[i4];
                        Intrinsics.checkNotNull(obj3);
                        obj4 = objArr[i3];
                        Intrinsics.checkNotNull(obj4);
                        if (((Comparable) obj3).compareTo(obj4) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    obj = objArr[i];
                    Intrinsics.checkNotNull(obj);
                    obj2 = objArr[i4];
                    Intrinsics.checkNotNull(obj2);
                    if (((Comparable) obj).compareTo(obj2) <= 0) {
                        break;
                        break;
                    }
                    d(i, i4);
                    i = i4;
                }
            }
        }
        T t = (T) tArr[atomicIntegerFieldUpdater.get(this)];
        Intrinsics.checkNotNull(t);
        t.f(null);
        t.i(-1);
        tArr[atomicIntegerFieldUpdater.get(this)] = null;
        return t;
    }

    public final void c(int i) {
        while (i > 0) {
            Object[] objArr = this.a;
            Intrinsics.checkNotNull(objArr);
            int i2 = (i - 1) / 2;
            Object obj = objArr[i2];
            Intrinsics.checkNotNull(obj);
            Object obj2 = objArr[i];
            Intrinsics.checkNotNull(obj2);
            if (((Comparable) obj).compareTo(obj2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        T[] tArr = this.a;
        Intrinsics.checkNotNull(tArr);
        T t = tArr[i2];
        Intrinsics.checkNotNull(t);
        T t2 = tArr[i];
        Intrinsics.checkNotNull(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.i(i);
        t2.i(i2);
    }
}
