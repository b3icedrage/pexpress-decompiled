package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Gd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1043Gd1<TSubject, TContext> {

    @NotNull
    private volatile /* synthetic */ Object _interceptors;

    @NotNull
    public final ArrayList a;
    public int b;
    public boolean c;

    @Nullable
    public C1277Jd1 d;

    public C1043Gd1(@NotNull C1277Jd1... phases) {
        Intrinsics.checkNotNullParameter(phases, "phases");
        new YH();
        this.a = WE.h(Arrays.copyOf(phases, phases.length));
        this._interceptors = null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084 A[LOOP:2: B:33:0x0082->B:34:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0090 A[LOOP:1: B:26:0x005b->B:36:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0093 A[EDGE_INSN: B:48:0x0093->B:37:0x0093 BREAK  A[LOOP:1: B:26:0x005b->B:36:0x0090], SYNTHETIC] */
    @Nullable
    public final Object a(@NotNull Object context, @NotNull Object subject, @NotNull LM lm) {
        ArrayList destination;
        int iE;
        int i;
        Object obj;
        C7860yd1 c7860yd1;
        List<InterfaceC1060Gj0<AbstractC1121Hd1<TSubject, Call>, TSubject, JM<? super Unit>, Object>> list;
        int size;
        int i2;
        int iE2;
        CoroutineContext coroutineContext = lm.getContext();
        if (((List) this._interceptors) == null) {
            int i3 = this.b;
            if (i3 == 0) {
                this._interceptors = C5653o60.d;
                this.c = false;
                this.d = null;
            } else {
                ArrayList arrayList = this.a;
                if (i3 != 1 || (iE2 = WE.e(arrayList)) < 0) {
                    destination = new ArrayList();
                    iE = WE.e(arrayList);
                    if (iE >= 0) {
                        i = 0;
                        while (true) {
                            obj = arrayList.get(i);
                            if (obj instanceof C7860yd1) {
                                c7860yd1 = (C7860yd1) obj;
                            } else {
                                c7860yd1 = null;
                            }
                            if (c7860yd1 != null) {
                                Intrinsics.checkNotNullParameter(destination, "destination");
                                list = c7860yd1.c;
                                destination.ensureCapacity(list.size() + destination.size());
                                size = list.size();
                                for (i2 = 0; i2 < size; i2++) {
                                    destination.add(list.get(i2));
                                }
                            }
                            if (i != iE) {
                                break;
                            }
                            i++;
                        }
                    }
                    this._interceptors = destination;
                    this.c = false;
                    this.d = null;
                } else {
                    int i4 = 0;
                    while (true) {
                        Object obj2 = arrayList.get(i4);
                        C7860yd1 c7860yd2 = obj2 instanceof C7860yd1 ? (C7860yd1) obj2 : null;
                        if (c7860yd2 != null && !c7860yd2.c.isEmpty()) {
                            Collection collection = c7860yd2.c;
                            c7860yd2.d = true;
                            this._interceptors = collection;
                            this.c = false;
                            this.d = c7860yd2.a;
                        } else if (i4 != iE2) {
                            i4++;
                        } else {
                            destination = new ArrayList();
                            iE = WE.e(arrayList);
                            if (iE >= 0) {
                                i = 0;
                                while (true) {
                                    obj = arrayList.get(i);
                                    if (obj instanceof C7860yd1) {
                                        c7860yd1 = (C7860yd1) obj;
                                    } else {
                                        c7860yd1 = null;
                                    }
                                    if (c7860yd1 != null) {
                                        Intrinsics.checkNotNullParameter(destination, "destination");
                                        list = c7860yd1.c;
                                        destination.ensureCapacity(list.size() + destination.size());
                                        size = list.size();
                                        while (i2 < size) {
                                            destination.add(list.get(i2));
                                        }
                                    }
                                    if (i != iE) {
                                        break;
                                        break;
                                    }
                                    i++;
                                }
                            }
                            this._interceptors = destination;
                            this.c = false;
                            this.d = null;
                        }
                    }
                }
            }
        }
        this.c = true;
        List interceptors = (List) this._interceptors;
        Intrinsics.checkNotNull(interceptors);
        boolean zD = d();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return ((C1199Id1.a || zD) ? new C3577eU(context, interceptors, subject, coroutineContext) : new C7626xW1(subject, context, interceptors)).a(subject, lm);
    }

    public final C7860yd1<TSubject, TContext> b(C1277Jd1 c1277Jd1) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c1277Jd1) {
                C7860yd1<TSubject, TContext> c7860yd1 = new C7860yd1<>(c1277Jd1, AbstractC1355Kd1.c.a);
                arrayList.set(i, c7860yd1);
                return c7860yd1;
            }
            if (obj instanceof C7860yd1) {
                C7860yd1<TSubject, TContext> c7860yd2 = (C7860yd1) obj;
                if (c7860yd2.a == c1277Jd1) {
                    return c7860yd2;
                }
            }
        }
        return null;
    }

    public final int c(C1277Jd1 c1277Jd1) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c1277Jd1 || ((obj instanceof C7860yd1) && ((C7860yd1) obj).a == c1277Jd1)) {
                return i;
            }
        }
        return -1;
    }

    public boolean d() {
        return false;
    }

    public final boolean e(C1277Jd1 c1277Jd1) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c1277Jd1) {
                return true;
            }
            if ((obj instanceof C7860yd1) && ((C7860yd1) obj).a == c1277Jd1) {
                return true;
            }
        }
        return false;
    }

    public final void f(@NotNull C1277Jd1 phase, @NotNull InterfaceC1060Gj0<? super AbstractC1121Hd1<TSubject, TContext>, ? super TSubject, ? super JM<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(block, "block");
        C7860yd1<TSubject, TContext> c7860yd1B = b(phase);
        if (c7860yd1B == null) {
            throw new C6514sC0("Phase " + phase + " was not registered for this pipeline");
        }
        F62.e(3, block);
        List list = (List) this._interceptors;
        if (!this.a.isEmpty() && list != null && !this.c && (!(list instanceof InterfaceC6745tJ0) || (list instanceof InterfaceC7165vJ0))) {
            if (Intrinsics.a(this.d, phase)) {
                list.add(block);
            } else if (Intrinsics.a(phase, CollectionsKt.L(this.a)) || c(phase) == WE.e(this.a)) {
                C7860yd1<TSubject, TContext> c7860yd1B2 = b(phase);
                Intrinsics.checkNotNull(c7860yd1B2);
                c7860yd1B2.a(block);
                list.add(block);
            }
            this.b++;
            return;
        }
        c7860yd1B.a(block);
        this.b++;
        this._interceptors = null;
        this.c = false;
        this.d = null;
    }
}
