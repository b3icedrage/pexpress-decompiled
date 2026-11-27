package defpackage;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.D01;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\b\u0012\u0004\u0012\u00028\u00000\u00052\u00020\u0006B\u001f\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0011H\u0004¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0011¢\u0006\u0004\b,\u0010+J\u001d\u0010.\u001a\u00020\u00112\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u00020\u00112\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b0\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u00103R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u0000088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"LL01;", "LD01;", "TModel", "LCs0;", "Lvt0;", "Lut0;", "Ltt0;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lsu0;", "_prefs", "<init>", "(Ljava/lang/String;Lsu0;)V", "model", "tag", "", "index", "", "addItem", "(LD01;Ljava/lang/String;Ljava/lang/Integer;)V", "removeItem", "(LD01;Ljava/lang/String;)V", ProductAction.ACTION_ADD, "(ILD01;Ljava/lang/String;)V", "", "list", "()Ljava/util/Collection;", "id", "get", "(Ljava/lang/String;)LD01;", ProductAction.ACTION_REMOVE, "(Ljava/lang/String;Ljava/lang/String;)V", "LH01;", "args", "onChanged", "(LH01;Ljava/lang/String;)V", "", "models", "replaceAll", "(Ljava/util/List;Ljava/lang/String;)V", "clear", "(Ljava/lang/String;)V", "load", "()V", "persist", "handler", "subscribe", "(Lvt0;)V", "unsubscribe", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lsu0;", "LO80;", "changeSubscription", "LO80;", "", "Ljava/util/List;", "", "hasLoadedFromCache", "Z", "getHasSubscribers", "()Z", "hasSubscribers", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class L01<TModel extends D01> implements InterfaceC0775Cs0<InterfaceC7286vt0<TModel>>, InterfaceC7076ut0<TModel>, InterfaceC6866tt0 {

    @Nullable
    private final InterfaceC6659su0 _prefs;

    @NotNull
    private final O80<InterfaceC7286vt0<TModel>> changeSubscription;
    private boolean hasLoadedFromCache;

    @NotNull
    private final List<TModel> models;

    @Nullable
    private final String name;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LD01;", "TModel", "Lvt0;", "it", "", "invoke", "(Lvt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function1<InterfaceC7286vt0<TModel>, Unit> {
        final /* synthetic */ TModel $model;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TModel tmodel, String str) {
            super(1);
            this.$model = tmodel;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((InterfaceC7286vt0) obj);
            return Unit.a;
        }

        public final void invoke(@NotNull InterfaceC7286vt0<TModel> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onModelAdded(this.$model, this.$tag);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LD01;", "TModel", "Lvt0;", "it", "", "invoke", "(Lvt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b extends ML0 implements Function1<InterfaceC7286vt0<TModel>, Unit> {
        final /* synthetic */ TModel $item;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TModel tmodel, String str) {
            super(1);
            this.$item = tmodel;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((InterfaceC7286vt0) obj);
            return Unit.a;
        }

        public final void invoke(@NotNull InterfaceC7286vt0<TModel> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onModelRemoved(this.$item, this.$tag);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LD01;", "TModel", "Lvt0;", "it", "", "invoke", "(Lvt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c extends ML0 implements Function1<InterfaceC7286vt0<TModel>, Unit> {
        final /* synthetic */ H01 $args;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(H01 h01, String str) {
            super(1);
            this.$args = h01;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((InterfaceC7286vt0) obj);
            return Unit.a;
        }

        public final void invoke(@NotNull InterfaceC7286vt0<TModel> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onModelUpdated(this.$args, this.$tag);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LD01;", "TModel", "Lvt0;", "it", "", "invoke", "(Lvt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class d extends ML0 implements Function1<InterfaceC7286vt0<TModel>, Unit> {
        final /* synthetic */ TModel $model;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TModel tmodel, String str) {
            super(1);
            this.$model = tmodel;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((InterfaceC7286vt0) obj);
            return Unit.a;
        }

        public final void invoke(@NotNull InterfaceC7286vt0<TModel> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onModelRemoved(this.$model, this.$tag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public L01() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final void addItem(TModel model, String tag, Integer index) {
        synchronized (this.models) {
            try {
                if (index != null) {
                    this.models.add(index.intValue(), model);
                } else {
                    this.models.add(model);
                }
                model.subscribe(this);
                persist();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.changeSubscription.fire(new a(model, tag));
    }

    public static /* synthetic */ void addItem$default(L01 l01, D01 d01, String str, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItem");
        }
        if ((i & 4) != 0) {
            num = null;
        }
        l01.addItem(d01, str, num);
    }

    private final void removeItem(TModel model, String tag) {
        synchronized (this.models) {
            this.models.remove(model);
            model.unsubscribe(this);
            persist();
            Unit unit = Unit.a;
        }
        this.changeSubscription.fire(new d(model, tag));
    }

    @Override // defpackage.InterfaceC7076ut0
    public void add(@NotNull TModel model, @NotNull String tag) {
        Object next;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.a(((D01) next).getId(), model.getId()));
                D01 d01 = (D01) next;
                if (d01 != null) {
                    removeItem(d01, tag);
                }
                addItem$default(this, model, tag, null, 4, null);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC7076ut0
    public void clear(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List<D01> listE0 = CollectionsKt.e0(this.models);
        synchronized (this.models) {
            this.models.clear();
            persist();
            Unit unit = Unit.a;
        }
        for (D01 d01 : listE0) {
            d01.unsubscribe((InterfaceC6866tt0) this);
            this.changeSubscription.fire(new b(d01, tag));
        }
    }

    @Override // defpackage.InterfaceC7076ut0
    @Nullable
    public abstract /* synthetic */ D01 create(@Nullable JSONObject jSONObject);

    @Override // defpackage.InterfaceC7076ut0
    @Nullable
    public TModel get(@NotNull String id) {
        Object next;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterator<T> it = this.models.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.a(((D01) next).getId(), id)) {
                return (TModel) next;
            }
        }
        next = null;
        return (TModel) next;
    }

    @Override // defpackage.InterfaceC0775Cs0
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Override // defpackage.InterfaceC7076ut0
    @NotNull
    public Collection<TModel> list() {
        List listE0;
        synchronized (this.models) {
            listE0 = CollectionsKt.e0(this.models);
        }
        return listE0;
    }

    public final void load() {
        InterfaceC6659su0 interfaceC6659su0;
        if (this.name == null || (interfaceC6659su0 = this._prefs) == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray(interfaceC6659su0.getString("OneSignal", "MODEL_STORE_" + this.name, "[]"));
        synchronized (this.models) {
            try {
                boolean zIsEmpty = this.models.isEmpty();
                for (int length = jSONArray.length() - 1; -1 < length; length--) {
                    D01 d01Create = create(jSONArray.getJSONObject(length));
                    if (d01Create != null) {
                        List<TModel> list = this.models;
                        if (list == null || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (Intrinsics.a(((D01) it.next()).getId(), d01Create.getId())) {
                                        NS0.debug$default("ModelStore<" + this.name + ">: load - operation.id: " + d01Create.getId() + " already exists in the store.", null, 2, null);
                                        break;
                                    }
                                }
                            }
                        }
                        this.models.add(0, (TModel) d01Create);
                        d01Create.subscribe((InterfaceC6866tt0) this);
                        break;
                    }
                }
                this.hasLoadedFromCache = true;
                if (!zIsEmpty) {
                    persist();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6866tt0
    public void onChanged(@NotNull H01 args, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        persist();
        this.changeSubscription.fire(new c(args, tag));
    }

    public final void persist() {
        if (this.name == null || this._prefs == null || !this.hasLoadedFromCache) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (this.models) {
            try {
                Iterator<TModel> it = this.models.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJSON());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this._prefs.saveString("OneSignal", "MODEL_STORE_" + this.name, jSONArray.toString());
    }

    @Override // defpackage.InterfaceC7076ut0
    public void remove(@NotNull String id, @NotNull String tag) {
        Object next;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.a(((D01) next).getId(), id));
                D01 d01 = (D01) next;
                if (d01 == null) {
                    return;
                }
                removeItem(d01, tag);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void replaceAll(@NotNull List<? extends TModel> models, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (models) {
            try {
                clear(tag);
                Iterator<? extends TModel> it = models.iterator();
                while (it.hasNext()) {
                    add(it.next(), tag);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public L01(@Nullable String str, @Nullable InterfaceC6659su0 interfaceC6659su0) {
        this.name = str;
        this._prefs = interfaceC6659su0;
        this.changeSubscription = new O80<>();
        this.models = new ArrayList();
    }

    @Override // defpackage.InterfaceC0775Cs0
    public void subscribe(@NotNull InterfaceC7286vt0<TModel> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeSubscription.subscribe(handler);
    }

    @Override // defpackage.InterfaceC0775Cs0
    public void unsubscribe(@NotNull InterfaceC7286vt0<TModel> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeSubscription.unsubscribe(handler);
    }

    public /* synthetic */ L01(String str, InterfaceC6659su0 interfaceC6659su0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : interfaceC6659su0);
    }

    @Override // defpackage.InterfaceC7076ut0
    public void add(int index, @NotNull TModel model, @NotNull String tag) {
        Object next;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.a(((D01) next).getId(), model.getId()));
                D01 d01 = (D01) next;
                if (d01 != null) {
                    removeItem(d01, tag);
                }
                addItem(model, tag, Integer.valueOf(index));
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
