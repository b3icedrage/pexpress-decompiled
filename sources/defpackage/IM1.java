package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import defpackage.D01;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"LIM1;", "LD01;", "TModel", "LSu0;", "Lvt0;", "LL01;", Payload.TYPE_STORE, "<init>", "(LL01;)V", "model", "", "tag", "", "replace", "(LD01;Ljava/lang/String;)V", "LTu0;", "handler", "subscribe", "(LTu0;)V", "unsubscribe", "onModelAdded", "LH01;", "args", "onModelUpdated", "(LH01;Ljava/lang/String;)V", "onModelRemoved", "LL01;", "getStore", "()LL01;", "LO80;", "changeSubscription", "LO80;", "singletonId", "Ljava/lang/String;", "", "replaceLock", "Ljava/lang/Object;", "getModel", "()LD01;", "", "getHasSubscribers", "()Z", "hasSubscribers", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class IM1<TModel extends D01> implements InterfaceC2031Su0<TModel>, InterfaceC7286vt0<TModel> {

    @NotNull
    private final O80<InterfaceC2109Tu0<TModel>> changeSubscription;

    @NotNull
    private final Object replaceLock;

    @NotNull
    private final String singletonId;

    @NotNull
    private final L01<TModel> store;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LD01;", "TModel", "LTu0;", "it", "", "invoke", "(LTu0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function1<InterfaceC2109Tu0<TModel>, Unit> {
        final /* synthetic */ H01 $args;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H01 h01, String str) {
            super(1);
            this.$args = h01;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((InterfaceC2109Tu0) obj);
            return Unit.a;
        }

        public final void invoke(@NotNull InterfaceC2109Tu0<TModel> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onModelUpdated(this.$args, this.$tag);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LD01;", "TModel", "LTu0;", "it", "", "invoke", "(LTu0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b extends ML0 implements Function1<InterfaceC2109Tu0<TModel>, Unit> {
        final /* synthetic */ TModel $existingModel;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TModel tmodel, String str) {
            super(1);
            this.$existingModel = tmodel;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((InterfaceC2109Tu0) obj);
            return Unit.a;
        }

        public final void invoke(@NotNull InterfaceC2109Tu0<TModel> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onModelReplaced(this.$existingModel, this.$tag);
        }
    }

    public IM1(@NotNull L01<TModel> store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.store = store;
        this.changeSubscription = new O80<>();
        this.singletonId = "-singleton-";
        this.replaceLock = new Object();
        store.subscribe((InterfaceC7286vt0) this);
    }

    @Override // defpackage.InterfaceC2031Su0, defpackage.InterfaceC0775Cs0
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    @Override // defpackage.InterfaceC2031Su0
    @NotNull
    public TModel getModel() {
        synchronized (this) {
            TModel tmodel = (TModel) this.store.get(this.singletonId);
            if (tmodel != null) {
                return tmodel;
            }
            TModel tmodel2 = (TModel) InterfaceC7076ut0.a.create$default(this.store, null, 1, null);
            if (tmodel2 != null) {
                tmodel2.setId(this.singletonId);
                InterfaceC7076ut0.a.add$default(this.store, tmodel2, null, 2, null);
                return tmodel2;
            }
            throw new Exception("Unable to initialize model from store " + this.store);
        }
    }

    @NotNull
    public final L01<TModel> getStore() {
        return this.store;
    }

    @Override // defpackage.InterfaceC7286vt0
    public void onModelAdded(@NotNull TModel model, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // defpackage.InterfaceC7286vt0
    public void onModelRemoved(@NotNull TModel model, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // defpackage.InterfaceC7286vt0
    public void onModelUpdated(@NotNull H01 args, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.changeSubscription.fire(new a(args, tag));
    }

    @Override // defpackage.InterfaceC2031Su0
    public void replace(@NotNull TModel model, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.replaceLock) {
            D01 model2 = getModel();
            model2.initializeFromModel(this.singletonId, model);
            this.store.persist();
            this.changeSubscription.fire(new b(model2, tag));
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.InterfaceC2031Su0, defpackage.InterfaceC0775Cs0
    public void subscribe(@NotNull InterfaceC2109Tu0<TModel> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeSubscription.subscribe(handler);
    }

    @Override // defpackage.InterfaceC2031Su0, defpackage.InterfaceC0775Cs0
    public void unsubscribe(@NotNull InterfaceC2109Tu0<TModel> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeSubscription.unsubscribe(handler);
    }
}
