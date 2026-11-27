package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class M42 extends E42 {
    public int D;
    public ArrayList<E42> B = new ArrayList<>();
    public boolean C = true;
    public boolean E = false;
    public int F = 0;

    public class a extends J42 {
        public final /* synthetic */ E42 d;

        public a(E42 e42) {
            this.d = e42;
        }

        @Override // E42.d
        public final void b(@NonNull E42 e42) {
            this.d.C();
            e42.z(this);
        }
    }

    public static class b extends J42 {
        public M42 d;

        @Override // E42.d
        public final void b(@NonNull E42 e42) {
            M42 m42 = this.d;
            int i = m42.D - 1;
            m42.D = i;
            if (i == 0) {
                m42.E = false;
                m42.o();
            }
            e42.z(this);
        }

        @Override // defpackage.J42, E42.d
        public final void d() {
            M42 m42 = this.d;
            if (m42.E) {
                return;
            }
            m42.K();
            m42.E = true;
        }
    }

    @Override // defpackage.E42
    @NonNull
    public final void A(@NonNull View view) {
        for (int i = 0; i < this.B.size(); i++) {
            this.B.get(i).A(view);
        }
        this.j.remove(view);
    }

    @Override // defpackage.E42
    public final void B(View view) {
        super.B(view);
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            this.B.get(i).B(view);
        }
    }

    @Override // defpackage.E42
    public final void C() {
        if (this.B.isEmpty()) {
            K();
            o();
            return;
        }
        b bVar = new b();
        bVar.d = this;
        Iterator<E42> it = this.B.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.D = this.B.size();
        if (this.C) {
            Iterator<E42> it2 = this.B.iterator();
            while (it2.hasNext()) {
                it2.next().C();
            }
            return;
        }
        for (int i = 1; i < this.B.size(); i++) {
            this.B.get(i - 1).a(new a(this.B.get(i)));
        }
        E42 e42 = this.B.get(0);
        if (e42 != null) {
            e42.C();
        }
    }

    @Override // defpackage.E42
    @NonNull
    public final /* bridge */ /* synthetic */ E42 E(long j) {
        N(j);
        return this;
    }

    @Override // defpackage.E42
    public final void F(E42.c cVar) {
        this.w = cVar;
        this.F |= 8;
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            this.B.get(i).F(cVar);
        }
    }

    @Override // defpackage.E42
    public final void H(E42.a aVar) {
        super.H(aVar);
        this.F |= 4;
        if (this.B != null) {
            for (int i = 0; i < this.B.size(); i++) {
                this.B.get(i).H(aVar);
            }
        }
    }

    @Override // defpackage.E42
    public final void I() {
        this.F |= 2;
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            this.B.get(i).I();
        }
    }

    @Override // defpackage.E42
    @NonNull
    public final void J(long j) {
        this.e = j;
    }

    @Override // defpackage.E42
    public final String L(String str) {
        String strL = super.L(str);
        for (int i = 0; i < this.B.size(); i++) {
            StringBuilder sbB = K1.b(strL, "\n");
            sbB.append(this.B.get(i).L(str + "  "));
            strL = sbB.toString();
        }
        return strL;
    }

    @NonNull
    public final void M(@NonNull E42 e42) {
        this.B.add(e42);
        e42.m = this;
        long j = this.g;
        if (j >= 0) {
            e42.E(j);
        }
        if ((this.F & 1) != 0) {
            e42.G(this.h);
        }
        if ((this.F & 2) != 0) {
            e42.I();
        }
        if ((this.F & 4) != 0) {
            e42.H(this.x);
        }
        if ((this.F & 8) != 0) {
            e42.F(this.w);
        }
    }

    @NonNull
    public final void N(long j) {
        ArrayList<E42> arrayList;
        this.g = j;
        if (j < 0 || (arrayList = this.B) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.B.get(i).E(j);
        }
    }

    @Override // defpackage.E42
    @NonNull
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void G(TimeInterpolator timeInterpolator) {
        this.F |= 1;
        ArrayList<E42> arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.B.get(i).G(timeInterpolator);
            }
        }
        this.h = timeInterpolator;
    }

    @NonNull
    public final void P(int i) {
        if (i == 0) {
            this.C = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(EK.e(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.C = false;
        }
    }

    @Override // defpackage.E42
    @NonNull
    public final void b(@NonNull View view) {
        for (int i = 0; i < this.B.size(); i++) {
            this.B.get(i).b(view);
        }
        this.j.add(view);
    }

    @Override // defpackage.E42
    public final void e(@NonNull Q42 q42) {
        if (x(q42.b)) {
            for (E42 e42 : this.B) {
                if (e42.x(q42.b)) {
                    e42.e(q42);
                    q42.c.add(e42);
                }
            }
        }
    }

    @Override // defpackage.E42
    public final void h(Q42 q42) {
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            this.B.get(i).h(q42);
        }
    }

    @Override // defpackage.E42
    public final void i(@NonNull Q42 q42) {
        if (x(q42.b)) {
            for (E42 e42 : this.B) {
                if (e42.x(q42.b)) {
                    e42.i(q42);
                    q42.c.add(e42);
                }
            }
        }
    }

    @Override // defpackage.E42
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final E42 clone() {
        M42 m42 = (M42) super.clone();
        m42.B = new ArrayList<>();
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            E42 e42Clone = this.B.get(i).clone();
            m42.B.add(e42Clone);
            e42Clone.m = m42;
        }
        return m42;
    }

    @Override // defpackage.E42
    public final void n(ViewGroup viewGroup, RO ro, RO ro2, ArrayList<Q42> arrayList, ArrayList<Q42> arrayList2) {
        long j = this.e;
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            E42 e42 = this.B.get(i);
            if (j > 0 && (this.C || i == 0)) {
                long j2 = e42.e;
                if (j2 > 0) {
                    e42.J(j2 + j);
                } else {
                    e42.J(j);
                }
            }
            e42.n(viewGroup, ro, ro2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.E42
    public final void p(ConstraintLayout constraintLayout) {
        super.p(constraintLayout);
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            this.B.get(i).p(constraintLayout);
        }
    }

    @Override // defpackage.E42
    public final void y(ViewGroup viewGroup) {
        super.y(viewGroup);
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            this.B.get(i).y(viewGroup);
        }
    }
}
