package br.app.mviviewmodel

typealias Reducer<State, Event> =  (state: State?, event: Event) -> State
