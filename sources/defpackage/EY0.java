package defpackage;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class EY0<T> extends W11<T> {
    public final C3945gC1<LiveData<?>, a<?>> l = new C3945gC1<>();

    public static class a<V> implements InterfaceC4819k81<V> {
        public final LiveData<V> a;
        public final InterfaceC4819k81<? super V> b;
        public int c = -1;

        public a(LiveData<V> liveData, InterfaceC4819k81<? super V> interfaceC4819k81) {
            this.a = liveData;
            this.b = interfaceC4819k81;
        }

        public final void a() {
            this.a.f(this);
        }

        @Override // defpackage.InterfaceC4819k81
        public final void d(V v) {
            int i = this.c;
            int i2 = this.a.g;
            if (i != i2) {
                this.c = i2;
                this.b.d(v);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void g() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.l.iterator();
        while (true) {
            C3945gC1.e eVar = (C3945gC1.e) it;
            if (!eVar.hasNext()) {
                return;
            } else {
                ((a) ((Map.Entry) eVar.next()).getValue()).a();
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.lifecycle.LiveData
    public void h() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.l.iterator();
        while (true) {
            C3945gC1.e eVar = (C3945gC1.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.a.j(aVar);
        }
    }

    public final <S> void l(@NonNull LiveData<S> liveData, @NonNull InterfaceC4819k81<? super S> interfaceC4819k81) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(liveData, interfaceC4819k81);
        a<?> aVarB = this.l.b(liveData, aVar);
        if (aVarB != null && aVarB.b != interfaceC4819k81) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarB == null && this.c > 0) {
            aVar.a();
        }
    }

    public final <S> void m(@NonNull LiveData<S> liveData) {
        a<?> aVarC = this.l.c(liveData);
        if (aVarC != null) {
            aVarC.a.j(aVarC);
        }
    }
}
