package cn.lyric.getter.hook

abstract class BaseHook {
    var isInit: Boolean = false
    abstract fun init()
}