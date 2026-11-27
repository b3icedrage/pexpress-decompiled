package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class I82<Model> implements I01<Model, Model> {
    public static final I82<?> a = new I82<>();

    public static class a<Model> implements J01<Model, Model> {
        public static final a<?> a = new a<>();

        @Override // defpackage.J01
        @NonNull
        public final I01<Model, Model> d(J11 j11) {
            return I82.a;
        }
    }

    @Override // defpackage.I01
    public final boolean a(@NonNull Model model) {
        return true;
    }

    @Override // defpackage.I01
    public final I01.a<Model> b(@NonNull Model model, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        return new I01.a<>(new M71(model), new b(model));
    }

    public static class b<Model> implements InterfaceC6771tS<Model> {
        public final Model d;

        public b(Model model) {
            this.d = model;
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final Class<Model> a() {
            return (Class<Model>) this.d.getClass();
        }

        @Override // defpackage.InterfaceC6771tS
        public final void c(@NonNull EnumC7035uh1 enumC7035uh1, @NonNull InterfaceC6771tS.a<? super Model> aVar) {
            aVar.f(this.d);
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final CS e() {
            return CS.d;
        }

        @Override // defpackage.InterfaceC6771tS
        public final void b() {
        }

        @Override // defpackage.InterfaceC6771tS
        public final void cancel() {
        }
    }
}
