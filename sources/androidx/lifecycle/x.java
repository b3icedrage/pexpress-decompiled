package androidx.lifecycle;

import android.app.Application;
import defpackage.C1580Nb;
import defpackage.Qd2;
import defpackage.U11;
import defpackage.VP;
import defpackage.Vd2;
import defpackage.Wd2;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    @NotNull
    public final Vd2 a;

    @NotNull
    public final b b;

    @NotNull
    public final VP c;

    public static class a extends c {

        @Nullable
        public static a c;

        @Nullable
        public final Application b;

        public a(Application application) {
            this.b = application;
        }

        @Override // androidx.lifecycle.x.c, androidx.lifecycle.x.b
        @NotNull
        public final <T extends Qd2> T a(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.b;
            if (application != null) {
                return (T) c(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.x.b
        @NotNull
        public final Qd2 b(@NotNull Class modelClass, @NotNull U11 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.b != null) {
                return a(modelClass);
            }
            Application application = (Application) extras.a(w.a);
            if (application != null) {
                return c(modelClass, application);
            }
            if (C1580Nb.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(modelClass);
        }

        public final <T extends Qd2> T c(Class<T> cls, Application application) {
            if (!C1580Nb.class.isAssignableFrom(cls)) {
                return (T) super.a(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNullExpressionValue(tNewInstance, "{\n                try {\n…          }\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    public interface b {
        @NotNull
        default <T extends Qd2> T a(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        @NotNull
        default Qd2 b(@NotNull Class modelClass, @NotNull U11 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return a(modelClass);
        }
    }

    public static class c implements b {

        @Nullable
        public static c a;

        @Override // androidx.lifecycle.x.b
        @NotNull
        public <T extends Qd2> T a(@NotNull Class<T> modelClass) throws InvocationTargetException {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            try {
                T tNewInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                Intrinsics.checkNotNullExpressionValue(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
            }
        }
    }

    public static class d {
        public void c(@NotNull Qd2 viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    public x(@NotNull Vd2 store, @NotNull b factory, @NotNull VP defaultCreationExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.a = store;
        this.b = factory;
        this.c = defaultCreationExtras;
    }

    @NotNull
    public final <T extends Qd2> T a(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NotNull
    public final Qd2 b(@NotNull Class modelClass, @NotNull String key) {
        Qd2 viewModel;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Vd2 vd2 = this.a;
        vd2.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = vd2.a;
        Qd2 qd2 = (Qd2) linkedHashMap.get(key);
        boolean zIsInstance = modelClass.isInstance(qd2);
        b bVar = this.b;
        if (zIsInstance) {
            d dVar = bVar instanceof d ? (d) bVar : null;
            if (dVar != null) {
                Intrinsics.checkNotNull(qd2);
                dVar.c(qd2);
            }
            Intrinsics.c(qd2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return qd2;
        }
        U11 u11 = new U11(this.c);
        u11.b(y.a, key);
        try {
            viewModel = bVar.b(modelClass, u11);
        } catch (AbstractMethodError unused) {
            viewModel = bVar.a(modelClass);
        }
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Qd2 qd3 = (Qd2) linkedHashMap.put(key, viewModel);
        if (qd3 != null) {
            qd3.h();
        }
        return viewModel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(@NotNull Vd2 store, @NotNull b factory) {
        this(store, factory, VP.a.b);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(@NotNull Wd2 owner, @NotNull b factory) {
        VP defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Vd2 viewModelStore = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (owner instanceof e) {
            defaultViewModelCreationExtras = ((e) owner).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = VP.a.b;
        }
        this(viewModelStore, factory, defaultViewModelCreationExtras);
    }
}
